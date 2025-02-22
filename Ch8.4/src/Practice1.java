import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge>{
    int vertex, value;
    Edge(int vertex, int value){
        this.vertex = vertex;
        this.value = value;
    }
    public int compareTo(Edge e){
        if (this.value > e.value){
            return 1;
        } else {
            return -1;
        }
    }
}

public class Practice1 {
    // 필요한 인자들 생성
    public static int V, E, K; // 노드 개수, 엣지 개수, 출발 노드
    public static int distance[]; // 거리
    public static boolean visited[]; // 방문여부
    public static ArrayList<Edge> list[]; // 엣지 리스트
    public static PriorityQueue<Edge> q = new PriorityQueue<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        
        distance = new int[V + 1];
        visited = new boolean[V+1];
        list = new ArrayList[V+1];
        
        // 노드의 개수만큼 그래프 정보를 저장하는 인접리스트 초기화하기
        for (int i = 1; i <= V; i++){
            list[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i <= V; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        
        // 인접리스트 배열에 이 엣지 정보를 저장하기
        for (int i = 0; i < E; i++){ // 가중치가 있는 인접리스트들 초기화하기
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Edge(v, w));
        }
        
        q.add(new Edge(K, 0)); // K를 시작점으로 설정, 그래서 거리가 0
        distance[K] = 0; // K에서의 distance는 0
        
        while(!q.isEmpty()){
            Edge current = q.poll();
            int c_v = current.vertex;
            if (visited[c_v]) continue; // 이미 방문한 적이 있는 노드는 다시 큐에 넣지 않음
            visited[c_v] = true;
        }
        
        for (int i =0; i < list[c_v].size(); i++){
            Edge tmp = list[c_v].get(i);
            int next = tmp.vertex;
            int value = tmp.value;

            if (distance[next] > distance[c_v] + value){
                distance[next] = value + distance[c_v];
                q.add(new Edge(next, distance[next]));
            }
        }


        for (int i =11; i <= V; i++){
            if (visited[i]){
                System.out.println(distance[i]);
            } else {
                System.out.println("INF");
            }
        }
    }
}