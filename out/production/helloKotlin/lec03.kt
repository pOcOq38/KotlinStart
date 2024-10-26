class lec03 {

//타입 변환 -> 명시적 to타입()
    fun main() {
        val number1 = 3  //int
        val number2: Long = number1.toLong()  //int가 long으로 바뀜

        val number3: Int? = 3   //null 가능
        // val number4: Long = number3.toLong() 불가 -> null일 경우 NPE
        val number4: Long = number3?.toLong() ?: 0L // safe call, elvis 사용해서 처리해줘야 함.

//일반 타입일 경우
        /* JAVA
         public static void printAgeIfPerson(Object obj){
             if(obj instanceof Person){      //instanceof: 변수가 주어진 타입이면 true
                 Person person = (Person) obj;
                 System.out.println(person.getAge());
         } */

        fun printAgeIfPerson1(obj: Any) {
            if (obj is Person) {     //반대는 if(obj !is Person)
                //val person = obj as Person   //obj를 Person으로 간주해서 person으로 -> 생략 가능
                println(obj.age)               // => 스마트캐스트
            }
        }


        fun printAgeIfPerson2(obj: Any?) {   //as? value null이면 null, value가 type아니면 null
            val person = obj as? Person  //obj가 null일 경우 전체가 null -> as?
            println(person?.age)          //person?
        }


// Type
        //Any  -> JAVA의 object역할 (모든 객체의 최상위 타입)
        // Any에 null 포함 불가 -> null포함 => Any?

        //Unit -> JAVA의 void
        //  단 하나의 인스턴스만 갖음

        //Nothing
        // 함수가 정상적으로 끝나지 않음 (e.g. 무한루프) -> Exception뜸


//문자열 사용
        // val person = Person("아무개", 100)
        //println("이름 : ${person.name}")

        val name = "아무개"
        println("이름: $name")


//여러 문자열 사용할 때
        val str = """
            ABC
            EFG
            ${name}
        """.trimIndent()
        println(str)

//문자열의 특정 문자 가져오기
        val str1 = "ABC"
        println(str1[0])  //A


    }
}

class Person {
    val age: Long? = 10L
}
