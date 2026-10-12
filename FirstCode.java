package FirstProject;

class Calculator {

    public int add(int n1, int n2) {
        return n1+n2;
    }
    public int sub(int n1, int n2) {
        return n1-n2;
    }
    public int mul(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1/n2;
    }
    public int pow(int n1, int n2) {
        int ans = 1;
        for(int i = 0; i<n2; i++) {
            ans *= n1;
        }
        return ans;
    }
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    public int mul(int n1, int n2, int n3) {
        return n1*n2*n3;
    }
    public int fact(int n) {
        int fact = 1;
        for(int i = 2; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public int abs(int n) {
        if(n<0) return n*-1;
        else return n;
    }
}
