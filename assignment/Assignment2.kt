package assignment

import java.util.Scanner

class KStack<T>{
    private val stack = mutableListOf<T>()

    fun push(element: T){
        stack.add(element)
    }
    fun pop(): T?{
        if(stack.size == 0)
            return null
        return stack.removeLast()
    }
    fun size(): Int{
        return stack.size;
    }
    fun find(element: T): Boolean{
        return stack.contains(element)
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val round = sc.nextInt()

    for (idx in 0..round) {
        println(idx)
        val stack = KStack<Char>()
        val nowPS = sc.next()
        var isPVS = true

        for (ps in nowPS) {
            if (ps == '(') {
                stack.push(ps)
            } else {
                if (stack.size() == 0) {
                    isPVS = false
                    break;
                }
                stack.pop()
            }
        }
        if(isPVS && stack.size() == 0)
            println("YES")
        else
            println("NO")
    }
}