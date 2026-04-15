package oop_68357_FredericoSarren.week08lec

fun main() {
    var nama:String? = null;

   try {
       var nama:String? = "Susi";
       println("nama kamu ${nama!!.uppercase()}");
   }catch(ex: Exception) {
       println("errornya adalah ${ex.message}");
   }

    var dataMhs: List<Any> = listOf(123, "Wirawan", 89, "Tangerang");
    for(item in dataMhs) {
        var itemFilter = item as? String;
        if(itemFilter != null) {
            println(itemFilter);
        }
    }
}