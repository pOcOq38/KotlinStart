class lec01 {
fun main() {

    // 가변 여부 - var: 수정O / val: 수정X
    var number1 = 10L // 수정 O
    number1 = 5L

    val number2 = 10L  //수정 X
    // number2 = 5L X

    //타입 지정하지 않아도 됨.
    //타입 지정하고 싶은 경우 -> : 타입
    var number3 : Long = 10L

    //초기값 지정해주지 않으면 컴파일 에러 발생
    // var number4: Long
    //println(number4); <- error 변수 초기화되어야 함

    //val 컬렉션 자체는 못 바꾸지만 안에 element 추가는 가능
    // - arrayList 자체는 못 바꾸는데 안에 element 추가 가능

    //Tip! 모든 변수 val로 만들고 필요한 경우에 var로 만든다.

    var number5 : Long = 10L
    //ptimitive type: long, reference type: Long 구별 안 해도 됨

    var number6: Long = 1_000L
    //number6 = null <- 불가 (null 못 들어가게 설계됨.)

    // 타입? 붙이면 null 들어가게 할 수 있음  => 아예 다른 타입으로 간주됨.
    var number7: Long? = 1_000L
    number7 = null

    //객체 인스턴스화: 자바와 다르게 new를 붙이지 않음
   // var person = Person("아무개")  -> 자바: Person person = new Person("아무개");

}
}