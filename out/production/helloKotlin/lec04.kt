class lec04 {

    //JAVA
    //객체간 비교할 때 compareTo

    //Kotlin
    // 객체간 비교할 때 비교연산자 쓰면 자동으로 compareTo 사용

    //JAVA
    //동등성: 값과 주소 모두 동일할 때 -> ==
    //동일성: 값은 동일하지만 주소가 다를 때 -> equals

    //Kotlin
    //동등성: 값과 주소 모두 동일할 때 -> ===
    //동일성: 값은 동일하지만 주소가 다를 때 -> == -> equals 호출

    //연산자 오버로딩
    fun main(){
        val money1 = Money(1_000L)
        val money2 = Money(2_000L)
        println(money1 + money2)      // 자바에서 plus를 정의했으면 money1.plus(money2) 이런 식으로 해야 함
    }


}

data class Money(
    val amount: Long
){
    operator fun plus(other: Money): Money{
        return Money(this.amount + other.amount)
    }
}