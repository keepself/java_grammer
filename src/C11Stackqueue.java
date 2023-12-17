import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11Stackqueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        pop:스택에서 요소를 제거후 해당 요소 반환
//        System.out.println(mySt.pop()); //30
////       peek : 스택에서 마지막 요소 반환. 제거x
//        System.out.println(mySt.peek()); //20
//        System.out.println(mySt); //10, 20
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());

//        웹페이지 방문 뒤로가기 기능 구현
//        Stack<String> myHistory = new Stack<>();

//        String객체 5개 정도 stack에 추가후while문을 통해 모두 출력


//        Stack<String> myStack = new Stack<>();
//        myStack.add("basketball");
//        myStack.add("baseball");
//        myStack.add("soccer");
//        myStack.add("tennis");
//        myStack.add("ping pong");
//
//        while (!myStack.isEmpty()) {
//            System.out.println(myStack.pop());
//        }
//   웹페이지 방문
//        방문한 사이트 출력 + history
//        뒤로가기 기능도 있어야함
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트방문일경우, 해당 주소 push
//        뒤로가기일경우 해당 주소 pop

//        Stack<String> stack2 = new Stack<>();
//        Stack<String> stack3 = new Stack<>();
//        System.out.println("사이트 입력하세요. 0,00 제외");
//        Scanner sc = new Scanner(System.in);
//        String page_num = sc.nextLine();
//        stack2.push(page_num);
//        while (!stack2.isEmpty()) {
//            System.out.println(stack2);
//            System.out.println(stack3);
//            System.out.println("현재 사이트는 " + stack2.peek() + " 입니다.");
//            System.out.println("사이트 입력하세요.");
//            System.out.println("뒤로 가기를 원하시면 '0'을 입력해주세요");
//            if (stack3.size() > 0) {
//                System.out.println("앞으로 가기를 원하시면 '00'을 입력해주세요");
//            }
//            page_num = sc.nextLine();
//            if (page_num.equals("0")) {
//                stack3.push(stack2.pop());
//            } else if (page_num.equals("00")) {
//                stack2.push(stack3.pop());
//            } else {
//                stack2.push(page_num);
//            }
//        }


//큐선언
//        Queue<Integer> myQue = new LinkedList();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll());
//        System.out.println();

// 프린터대기열 예제
// 문서1추가, 문서2추가 , 문서3추가
//        while문을 통해 "현재 인쇄 중인 문서 : 문서 1"

//        Queue<String> myQue1 = new LinkedList<>();
//        myQue1.add("문서1");
//        myQue1.add("문서2");
//        myQue1.add("문서3");
//        while (!myQue1.isEmpty()) {
//            System.out.println("현재 인쇄 중인 문서" + myQue1.poll());
//        }
//
//
//        //    길이에 제한이 있는 큐 :ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
//
////    add와 offer의 차이 : add는 길이가 다 찼을때 에러를 발생. offer 공간이 충분할때만 ad//    d
//
//        myQue.add("hello1");
//        myQue.add("hello2");
//        myQue.add("hello3");
//        System.out.println(myQue);
//
////  우선순위 qu
//
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
//    int K=7;
//            Queue<Integer> myQue = new PriorityQueue<>();
//            for(int a : scoville){
//                myQue.add(a);
//
//    }
//        int answer = 0;
//        while (true) {
//            if(myQue.peek() >= K) {
//                break;
//            }else if(myQue.size() == 1 && myQue.peek() < K) {
//                answer = -1;
//                break;
//            }else{
//                answer++;
//                int temp = myQue.poll() + myQue.poll()*2;;
//                myQue.add(temp);
//            }
//
//
//            }

//      ArrayDeque : 양방향에서 데이터를 삽입/ 제거 할수 있다. 성능빠름
//
//    Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addFirst(10);
//        myDeque.addFirst(20);
//        System.out.println(myDeque);
//        myDeque.addLast(30);
//        System.out.println(myDeque);
//
//        System.out.println(myDeque.pollFirst());
//        System.out.println(myDeque.pollLast());
//        System.out.println(myDeque);




//






    }

}










