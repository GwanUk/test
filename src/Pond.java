public class Pond {

    int[] dy = {-1, 1};
    int[] dx = {-1, 1};
    public int[][] check;

    public int[][] pond = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public int init(int y, int x) {

        if (y < 0 || y > 9 || x < 0 || x > 9) return 0;
        if (check[y][x] == -1) return pond[y][x];
        check[y][x] = -1;

        if (pond[y][x] != 0
                && pond[y + dy[0]][x] >= pond[y][x]
                && pond[y + dy[1]][x] >= pond[y][x]
                && pond[y][x + dx[0]] >= pond[y][x]
                && pond[y][x + dx[1]] >= pond[y][x]) {

            pond[y][x] += 1;
        }


        int v1 = init(y + dy[0], x);
        int v2 = init(y + dy[1], x);
        int v3 = init(y, x + dx[0]);
        int v4 = init(y, x + dx[1]);

        int max = pond[y][x];

        if (v1 > max) max = v1;
        if (v2 > max) max = v2;
        if (v3 > max) max = v3;
        if (v4 > max) max = v4;

        return max;
    }

    public void start(int y, int x) {
        int n = 1;
        int r = 0;
        do {
            if (r != 0) n = r;
            check = new int[10][10];
            r = init(y, x);
        } while (r > n);
    }

    public void getPond() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sum += pond[i][j];
                System.out.print(pond[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("sum = " + sum);
    }
}
