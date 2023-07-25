package net.flow9.thisiskotlin.teamproject

fun main(){
    val selectMenus = SelectMenu()
        selectMenus.run()
}

fun result(type: String): Any {
    return when (type) {
        "selectNumber" -> {
            println("▶ 메뉴를 선택해주세요")
            while (true) {
                try {
                    val selectNumber: String? = readLine()
                    return selectNumber?.toInt() ?: -1
                } catch (e: java.lang.Exception) {
                    println("번호를 다시 선택해주세요")
                }
            }
        }
        else -> {
            return "no"
        }
    }
}

