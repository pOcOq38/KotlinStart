class lec02 {
        //null 다루는 법


    // 1. ================================================================
    /* JAVA
    public boolean startsWithA1(String str){ //null이 들어갈 수 없는 boolean
        if(str == null){
            throw new IllegalArgumentException("null이 들어왔습니다.");
        }
         return str.startsWith("A");
       } */

    fun startsWithA1(str: String?): Boolean{ //String?붙여서 null 들어올 수 있게

        /*if(str == null){
            throw IllegalArgumentException("null이 들어왔습니다.")
        }  return str.startsWith("A")
        아래 코드로 변경 */

        return str?.startsWith("A")                         //str이 null이 아니면 safe call 호출돼서 실행됨 -> t/f반환
            ?: throw IllegalArgumentException("null이 들어왔습니다.") //str이 null이면 safe call 호출X, 전체가 null이 됨.
                                                                  //                    => elvis연산자 뒤 호출(Exception)
    }


    //2.  ================================================================
    /* JAVA
    public Boolean startsWithA2(String str){  //null이 들어갈 수 있는 Boolean
       if(str == null){
           return null;
       }
       return str.startsWith("A");
    */
    fun startsWithA2(str: String?): Boolean?{
        /* if(str == null){
            return null
        }
        return str.startsWith("A")
        아래 코드로 변경 */
        return str?.startsWith("A") //str이 null이면 Boolean도 null을 허용해주기 때문에 null반환
    }                                     //      null아니면 t/f 반환



    //3.  ================================================================
    /*JAVA
    public boolean startsWithA2(String str){  //null이 들어갈 수 있는 boolean
        if(str == null){
            return false;
        }
        return str.startsWith("A");
        */

    fun startsWithA3(str: String?): Boolean{
       // str.startsWith("A")   null일 수 있어서 에러
        /*
        if(str == null){
            return false
        }
        return str.startsWith("A")
        아래 코드로 변경 */

        return str?.startsWith("A") ?: false  //str이 null이 아니면 safe call 호출돼서 실행됨 -> t/f반환
    }                                                //null이면 전체가 null ->elvis 뒤 반환(false)

// ================================================================
    fun startsWithA4(str: String): Boolean{
       return str.startsWith("A")
    }

    fun main(){
        //Safe Call: null이 아니면 실행. (null이면 safe call 호출X  전체가 null이 됨)
        val str: String? = "ABC"
        //println(str.length) String?기 때문에 null일 수도 있어서 불가능
        println(str?.length) // 가능
        //str이 null이면 값이 null이 나옴

        //Elvis 연산자
        str?.length ?: 0 //str이 null이 아니면 값(3)이 나오고 null일 경우 ?: 뒤의 값(0)이 나옴

    }

// ================================================================
    // 어떤 경우에도 null일 수가 없는 경우 -> !!
    fun startsWithA5(str: String?): Boolean{
        return str!!.startsWith("A")  //null이 들어모면 NPE뜸
    }

// ================================================================
    //자바클래스 사용할 때, @Nullable/ @Notnull 없으면 코틀린에서 null가능 여부 알 수 없어서 runtime에러 뜸
}