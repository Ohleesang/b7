class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var service = n/10
        answer = n*12000+(k-service)*2000
        return answer
    }
}
fun main(){
    val a = Solution()
    a.solution(10,3)//124,000
    a.solution(64,6)//768,000
}