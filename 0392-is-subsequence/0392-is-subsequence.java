class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true; // 빈 문자열은 항상 부분 문자열
        
        int s_start = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(s_start)) {
                s_start++;
                if (s_start == s.length()) { // 모든 문자를 찾았으면 종료
                    return true;
                }
            }
        }
        
        return false; // 모든 문자를 찾지 못한 경우
    }
}