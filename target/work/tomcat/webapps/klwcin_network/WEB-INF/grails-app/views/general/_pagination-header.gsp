<g:if test="${myList != null}">
	<!-- PAGINATION HEADER -->
	<input type="hidden" name="totalCount" id="totalCount" value="${myList?.size() ?: 0}" />
	<div class="pagination-container clearfix">
		<div class="pagination-msg">
			<g:set var="startIndex" value="${params.offset? params.offset.toInteger() : 0}" />
			Showing ${startIndex + 1}-${startIndex + myList.size()} from ${myList.totalCount} records.
		</div>
		<div class="pagination pagination-sm pull-right margin6" id="${paginationId ?: 'pagination_div'}" >
			<g:paginate class="teste" controller="${controller}" action="index" total="${myList.totalCount}" params="[search: params.search]"/>
		</div>
		<div class="clearfix"></div>
	</div>
	<!-- / PAGINATION HEADER -->
</g:if>