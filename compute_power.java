/*  Problem Statement
You are given two numbers n and p. You need to find n raised to the power p. */
static int Power(int n,int p)
{
      // Your code here
      if(p == 0){
            return 1;
      }
      return n * Power(n, p -1);
}