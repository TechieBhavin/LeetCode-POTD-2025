class Solution {
    public int countPalindromicSubsequence(String s) {
        int f[]=new int[26];
        int l[]=new int[26];
        Arrays.fill(f, -1);
        int ans=0;

        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'a';
            if(f[x]==-1)
            {
                f[x]=i;
            }
            l[x]=i;
        }

        for(int i=0;i<26;i++)
        {
            if(f[i]!=-1 && l[i]>f[i])
            {
                HashSet<Character> set=new HashSet<>();
                for(int j=f[i]+1;j<l[i];j++)
                {
                    set.add(s.charAt(j));
                }
                ans+=set.size();
            }
        }

        return ans;
    }
}
