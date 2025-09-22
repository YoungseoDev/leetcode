class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        list1 = list(word1)
        list2 = list(word2)
        answer = ""
        while list1 or list2:
            if list1:
                answer += list1.pop(0)
            if list2:
                answer += list2.pop(0)

        return answer
        
        
        