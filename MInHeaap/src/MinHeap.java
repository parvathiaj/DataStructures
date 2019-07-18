
public class MinHeap {
int []arr;
MinHeap(int[]key){
	arr=key;
}
void print()//(5 3 8 6 2 1 7 9 4 0)
{for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
System.out.println();
	}
int parent(int i) {
	int p;
	p=(i-1)/2;
	return p;	
}
int get(int i) {
	return arr[i];
}
int left(int i) {
	int l;
	l=2*i+1;
	if(l<arr.length)
	   return l;
	else
		return -1;
}
int right(int i) {
		int r;
  r=2*i+2;
  if(r<arr.length)
  return r;
  else 
	  return -1;
}
int check(int i) {
			
	
	if(left(i)==-1 && right(i)==-1)
		   return i;
	else if(right(i)==-1) {
		if(arr[i]<arr[left(i)])
			return i;
		else
			return left(i);
	}
	else {
		if(arr[i]<arr[left(i)] && arr[i]<arr[right(i)])
			return i;
		else if(arr[i]>arr[left(i)] && arr[i]<arr[right(i)])
			return left(i);
		else if(arr[i]<arr[left(i)] && arr[i]>arr[right(i)])
			return right(i);
		else {
			if(arr[left(i)]>arr[right(i)])
				return right(i);
			else
				return left(i);
		}
	}
	
}
void exchange(int i,int j) {//return type was integer
	int tp=arr[i];
	arr[i]=arr[j];
	arr[j]=tp;

}
void fixHeap(int i) {
	int j=check(i);
	if(i==j)
		return;
	else {
		exchange(i,j);
		fixHeap(j);
	}
}
void buildHeap(){
	int n=9;
	for(int i=(n-1)/2;i>=0;i++) {
		int j=check(i);
		if(i==j)
			return;
		else
			fixHeap(i);
	}
}
int getMin() {
int val=arr[0];int size=10;
arr[0]=arr[arr.length-1];
fixHeap(0);
size--;
return val;
	}
}
