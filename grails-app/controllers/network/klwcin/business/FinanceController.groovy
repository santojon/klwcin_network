package network.klwcin.business

import grails.plugin.springsecurity.annotation.Secured
import network.klwcin.business.Donation
import network.klwcin.business.Expense

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_NONE'])
class FinanceController {

	Double balance = 0
	def lastDonations = []
	def allDonations = []
	def lastExpenses = []
	def allExpenses = []
	
    def index() {
		balance = getBalance()
		
		[donations: Donation.list(max: 10, sort: 'date'),
			expenses: Expense.list(max: 10, sort: 'date'),
				balance: balance]
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
	
	def showDonation(Donation donation) {
		render(view: '/donation/show', model: [donationInstance: donation])
	}
	
	def showExpense(Expense expense) {
		render(view: '/expense/show', model: [expenseInstance: expense])
	}
}
