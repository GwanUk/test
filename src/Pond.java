public class Pond {

    int[] dy = {-1, 1};
    int[] dx = {-1, 1};
    int sum = 0;

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

    public int[][] check = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public void start(int y, int x) {

        if (y < 0 || y > 9 || x < 0 || x > 9) {
            return;
        }

        if (check[y][x] == -1) {
            return;
        }else{
            check[y][x] = -1;
        }

        if (pond[y][x] != 0) {
            if (pond[y + dy[0]][x + dx[0]] >= pond[y][x] && pond[y + dy[0]][x + dx[1]] >= pond[y][x] && pond[y + dy[1]][x + dx[0]] >= pond[y][x] && pond[y + dy[1]][x + dx[1]] >= pond[y][x]) {
                pond[y][x] += 1;
                sum += pond[y][x];
            }
        }

        start(y + dy[0], x);
        start(y + dy[1], x);
        start(y, x + dx[0]);
        start(y, x + dx[1]);
    }

    public void getPond() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(pond[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
