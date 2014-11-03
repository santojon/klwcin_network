<div class="modal" id="remove-user" tabindex="-3" role="dialog" aria-labelledby="remove-userLabel" aria-hidden="true" data-backdrop="static">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
		
			<!-- Title -->
			<div class="modal-header">
				<button type="button" id="close_modal_btn_remove" class="close" data-dismiss="modal" aria-hidden="true" title="Close">&times;</button>
				<h2 class="modal-title" id="title_remove">Remove User</h2>
			</div>
			<!-- / Title -->
			
			<!-- Content -->
			<div class="modal-body">
				<div class="modal-glyphicon">
					<span class="glyphicon glyphicon-exclamation-sign"></span>
				</div>
				<div class="modal-body-msg">
					<p>Are you sure you want to remove <span class="txt-bold" id="userName"></span> User from database?</p>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- / Content -->

			<!-- Action -->
			<div class="modal-footer">
				<button type="submit" class="btn btn-alert btn-danger" id=“submit_btn_remove” data-dismiss="modal" data-toggle="modal">Confirm</button>
			</div>
			<!-- / Action -->
		</div>
	</div>
</div>