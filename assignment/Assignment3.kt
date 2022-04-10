package assignment

data class Food(
    val name: String,
    val price: Int
)

fun printFoodList(foodList: List<Food>, foodTotalCount: Int) {
    println("<출력>")
    foodList.forEach {
        println("${it.name} ${it.price}원")
    }
    println("------------------")
    println("총합 ${foodTotalCount}원")
}

fun main(){
    val foodList = listOf<Food>(
        Food("돼지목살", 6000),
        Food("제로콜라", 2000),
        Food("민트초코오레오", 1500),
        Food("진라면순한맛", 1000)
    )
    printFoodList(foodList, foodList.sumOf { it.price })
}
