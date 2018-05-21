<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>




<div class="container">
		<div class="col s12 m7">
    			<div class="card horizontal" >	     				
      				<div class="card-stacked">
        				<div class="card-content">
        					<h5 class="font-3 b"><a ></a></h5>
         					 <p>qfqwf</p>
       					</div>
        				<div class="card-action">
          					<div class="chip">
							    <img  alt="Contact Person"/>
							    <span ></span>
							</div>
							<div class="chip">
							    <span><b></b> <i class="fa fa-comments" aria-hidden="true"></i>
							    comments</span>
							</div>
							<code class="grey-text right" ></code>
        				</div>
      				</div>
    			</div>
  		</div>
	</div>
	
	
	<div id="modal-addForum" class="modal bottom-sheet">
	    <form method="post">
		    <div class="modal-content">
		      <h5>New Forum</h5>
		      <div class="input-field">
		      		<label for="nama">Topik Forum</label>
					<input id="nama" type="text"  class="validate"
						 /> 
				</div>
		      <label for="textarea1">Deskripsi Forum</label>
		      <textarea id="textarea1" class="materialize-textarea" ></textarea>							      
		    </div>
		    <div class="modal-footer">
		      <input type="submit" value="Submit" class="modal-action teal white-text waves-effect waves-green btn-flat" />
		    </div>
	    </form>
	    
  	</div>
	

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>