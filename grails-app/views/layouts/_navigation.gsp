			<div class="navbar-menu">
				<ul class="nav navbar-menu">
					<li id="top-home" class="active" onClick="changeActive('top-home', 'top-network');"><a href="${createLink(uri: '/index')}" title="Home">Home</a></li>
					<li id="top-network" class="hidden" onClick="changeActive('top-network', 'top-home');"><a href="#" title="The door to our fraternity">Network</a></li>
				</ul>
			</div>
			<nav class="navbar-submenu clearfix" id="menuAdmin" role="navigation">
				<ul class="nav navbar-nav">			
					
						<li id="userMenu" class="">
							<a href="${createLink(uri: '/user')}" id="users" title="Manage user's accounts and information">Users</a>
						</li>
						
						<li id="meetingMenu" class="">
							<a href="${createLink(uri: '/meeting')}" id="meetings" title="Manage meetings and participants of then">Meetings</a>
						</li>
						
						<li class="hidden" id="financesMenu" class="btn-group">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="finances_menu" title="Manage expenses and donations">Finances <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									
									<li id="financeMenu" class="">
										<a href="${createLink(uri: '/finance')}" id="finances">Finances Balance</a>
									</li>
									
									<li id="donationMenu" class="">
										<a href="${createLink(uri: '/donation')}" id="donations">Manage Donations</a>
									</li>
									
									
									<li id="expenseMenu" class="">
										<a href="${createLink(uri: '/expense')}" id="expenses">Manage Expenses</a>
									</li>
									
								</ul>
						</li>
					
				</ul>
			</nav>