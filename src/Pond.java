public class Pond {

    int[] dy = {-1, 1};
    int[] dx = {-1, 1};
    boolean flag;
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

    public void init(int y, int x) {

        if (y < 0 || y > 9 || x < 0 || x > 9) return;
        if (check[y][x] == -1) return;
        check[y][x] = -1;

        if (pond[y][x] != 0
                && pond[y + dy[0]][x] >= pond[y][x]
                && pond[y + dy[1]][x] >= pond[y][x]
                && pond[y][x + dx[0]] >= pond[y][x]
                && pond[y][x + dx[1]] >= pond[y][x]) {

            pond[y][x] += 1;
            flag = true;
        }


        init(y + dy[0], x);
        init(y + dy[1], x);
        init(y, x + dx[0]);
        init(y, x + dx[1]);
    }

    public void start(int y, int x) {
        do {
            check = new int[10][10];
            flag = false;
            init(y, x);
        }
        while (flag);
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
