$(document).ready(function (){
    $("#search").click(()=>searchInterlocutor())
})
function searchInterlocutor(){
    $(".searchResults").html('');
    const nameOrLogin = $("#searchLine").val()
    $.getJSON("/api/interlocutors",{
        name: nameOrLogin
    },(response)=>{
        for(let i = 0;i<response.length;i++){
             $(".searchResults").append(
                "<form action='/' class='user'>"+
                    "<button class='user'>"+
                    "<div class='userPhoto'></div>"+
                        "<input type='hidden' name='interlocutorLogin' value='"+response[i].login+"'/>"+
                        "<div class='userName'>"+response[i].name+"</div>"+
                        "<div class='userLogin'>"+response[i].login+"</div>"+
                    "</button>"+
                "</form>")
        }

    })
}