public class Recursion{

//Provide a brief description of what these functions do

int method1( int a, int n) {
    if ( n == 0 ) {
        return 1;
    }
    return ( a * method1(a,n-1));
}



int method2(int n)
{
    if(n == 1){
        return 1;
    }
    return n * (method2(n-1));
}



int method3(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        return method3(n-1) + method3(n-2);
    }
}



int method4(int i, int j) {
    if (j == 0 || j == i) {
      return 1;
    } else {
      return method4(i - 1, j - 1) + method4(i - 1, j);
    }
  }


}