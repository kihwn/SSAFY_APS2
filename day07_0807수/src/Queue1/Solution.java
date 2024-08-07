package Queue1;

import java.util.Scanner;

public class Solution {
    // 배열 사이즈가 10이면 10번 삽입할 수 있다.
    static String[] queue = new String[10];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            enQueue("good");
        }
        System.out.println(size());

        while (!isEmpty()) {
            String rItem = deQueue();
            System.out.println(rItem);
        }
        deQueue();
    }

    // 공백상태 확인
    static boolean isEmpty() {
        //front는 마지막으로 삭제된 원소, 꼬리는 저장된 원소의 idx를 가리키기 때문에
        //그 둘이 같을 경우 비어있다는 뜻.
        return front == rear;
    }

    // 포화상태 확인
    static boolean isFull() {
        // rear가 배열의 마지막 인덱스를 가리키면 포화상태
        return rear == queue.length - 1;
    }

    // 삽입
    static void enQueue(String item) {
        if (isFull()) {
            System.out.println("큐가 가득 찼습니다.");
            return;
        }
        //queue에 rear가 가리키는 곳에 입력값을 넣고, rear가 다음 idx를 가리키도록 업데이트.
        queue[++rear] = item;
    }

    // 삭제
    static String deQueue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return null;
        }
        //front는 가장 마지막으로 삭제된 원소의 idx를 가리키고 있기 때문에 +1하여 그다음 idx의 값을 리턴.
        return queue[++front];
    }

    // 삭제할 원소 조회
    static String Qpeek() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return null;
        }
        //front는 가장 마지막으로 삭제된 원소의 idx를 가리키고 있기 때문에 +1하여 그다음 idx의 값을 리턴.
        return queue[front + 1];
    }

    // 큐에 들어있는 데이터 개수
    static int size() {
        //저장된 원소 중 마지막에 들어온 원소의 idx - 마지막으로 삭제된 원소 = queue의 사이즈.
        return rear - front;
    }
}

