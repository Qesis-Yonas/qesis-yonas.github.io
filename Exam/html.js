(function(){
    function DeleteItem(){

        this.parentNode.remove();
    }
    $(document).ready(function(){
        $("button").click(DeleteItem);
    });
})();