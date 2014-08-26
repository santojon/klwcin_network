package network.klwcin.business

import grails.plugin.springsecurity.annotation.Secured;

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class FinanceController {

	def balance = 0
	def lastDonations = []
	def allDonations = []
	def lastExpenses = []
	def allExpenses = []
	
    def index() {
		lastDonations = Donation.findAll("from Donation as d order by d.date", [max: 10])
		lastExpenses = Expense.findAll("from Expense as e order by e.date", [max: 10])
		
		balance = getBalance()
		
		[donations: lastDonations, expenses: lastExpenses, balance: balance]
	}
	
	def getBalance() {
		def balance = 0.0
		allDonations = Donation.findAll()
		allExpenses = Expense.findAll()
		for(Donation d: allDonations) {
			balance += d.value
		}
		
		for(Expense e: allExpenses) {
			balance -= e.value
		}
		return balance
	}
}
