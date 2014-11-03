<div class="modal" id="remove-meeting" tabindex="-3" role="dialog" aria-labelledby="remove-meetingLabel" aria-hidden="true" data-backdrop="static">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
		
			<!-- Title -->
			<div class="modal-header">
				<button type="button" id="close_modal_btn_remove" class="close" data-dismiss="modal" aria-hidden="true" title="Close">&times;</button>
				<h2 class="modal-title" id="title_remove">Remove Meeting</h2>
			</div>
			<!-- / Title -->
			
			<!-- Content -->
			<div class="modal-body">
				<div class="modal-glyphicon">
					<span class="glyphicon glyphicon-exclamation-sign"></span>
				</div>
				<div class="modal-body-msg">
					<p>Are you sure you want to remove the meeting located in <span class="txt-bold" id="meetingPlace"></span> starts at <span class="txt-bold"><g:formatDate format="dd/MM/yy - HH:mm" id="meetingDate"/></span> from database?</p>
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