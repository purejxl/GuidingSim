package Model;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Wood on 2015/8/18.
 */
public class Graph extends SimpleWeightedGraph<Vertex, DefaultWeightedEdge> {
    public static Vertex CORNER_A   =   new Vertex("轉角A",       "轉角A");
    public static Vertex CORNER_B   =   new Vertex("轉角B",       "轉角B");
    public static Vertex CORNER_C   =   new Vertex("轉角C",       "轉角C");
    public static Vertex CORNER_D   =   new Vertex("轉角D",       "轉角D");
    public static Vertex CORNER_E   =   new Vertex("轉角E",       "轉角E");
    public static Vertex CORNER_F   =   new Vertex("轉角F",       "轉角F");
    public static Vertex CORNER_G   =   new Vertex("轉角G",       "轉角G");
    public static Vertex ELEVATOR_A =   new Vertex("電梯A",       "電梯A");
    public static Vertex ELEVATOR_B =   new Vertex("電梯B",       "電梯B");
    public static Vertex STAIR1     =   new Vertex("樓梯1",       "樓梯1");
    public static Vertex STAIR2     =   new Vertex("樓梯2",       "樓梯2");
    public static Vertex STAIR3     =   new Vertex("樓梯3",       "樓梯3");
    public static Vertex NODE1      =   new Vertex("節點1",       "節點1");
    public static Vertex NODE2      =   new Vertex("節點2",       "節點2");
    public static Vertex NODE3      =   new Vertex("節點3",       "節點3");
    public static Vertex NODE4      =   new Vertex("節點4",       "節點4");
    public static Vertex NODE5      =   new Vertex("節點5",       "節點5");
    public static Vertex NODE6      =   new Vertex("節點6",       "節點6");
    public static Vertex NODE7      =   new Vertex("節點7",       "節點7");
    public static Vertex NODE8      =   new Vertex("節點8",       "節點8");
    public static Vertex NODE9      =   new Vertex("節點9",       "節點9");
    public static Vertex NODE10     =   new Vertex("節點10",      "節點10");
    public static Vertex NODE11     =   new Vertex("節點11",      "節點11");
    public static Vertex NODE12     =   new Vertex("節點12",      "節點12");
    public static Vertex NODE13     =   new Vertex("節點13",      "節點13");
    public static Vertex NODE14     =   new Vertex("節點14",      "節點14");
    public static Vertex NODE15     =   new Vertex("節點15",      "節點15");
    public static Vertex NODE16     =   new Vertex("節點16",      "節點16");
    public static Vertex NODE17     =   new Vertex("節點17",      "節點17");
    public static Vertex NODE18     =   new Vertex("節點18",      "節點18");
    public static Vertex NODE19     =   new Vertex("節點19",      "節點19");
    public static Vertex NODE20     =   new Vertex("節點20",      "節點20");
    public static Vertex NODE21     =   new Vertex("節點21",      "節點21");
    public static Vertex NODE22     =   new Vertex("節點22",      "節點22");
    public static Vertex NODE23     =   new Vertex("節點23",      "節點23");
    public static Vertex NODE24     =   new Vertex("節點24",      "節點24");
    public static Vertex NODE25     =   new Vertex("節點25",      "節點25");
    public static Vertex NODE26     =   new Vertex("節點26",      "節點26");
    public static Vertex NODE27     =   new Vertex("節點27",      "節點27");
    public static Vertex NODE28     =   new Vertex("節點28",      "節點28");
    public static Vertex NODE29     =   new Vertex("節點29",      "節點29");
    public static Vertex NODE30     =   new Vertex("節點30",      "節點30");
    public static Vertex NODE31     =   new Vertex("節點31",      "節點31");
    public static Vertex NODE32     =   new Vertex("節點32",      "節點32");
    public static Vertex NODE33     =   new Vertex("節點33",      "節點33");
    public static Vertex NODE34     =   new Vertex("節點34",      "節點34");
    public static Vertex NODE35     =   new Vertex("節點35",      "節點35");
    public static Vertex NODE36     =   new Vertex("節點36",      "節點36");
    public static Vertex NODE37     =   new Vertex("節點37",      "節點37");
    public static Vertex NODE38     =   new Vertex("節點38",      "節點38");
    public static Vertex NODE39     =   new Vertex("節點39",      "節點39");
    public static Vertex IE201      =   new Vertex("資電201",     "資訊系辦公室");
    public static Vertex IE201_1    =   new Vertex("資電201-1",   "主任辦公室");
    public static Vertex IE202      =   new Vertex("資電202",     "資電學院辦公室");
    public static Vertex IE202_1    =   new Vertex("資電202-1",   "院長辦公室");
    public static Vertex IE203      =   new Vertex("資電203",     "研討室");
    public static Vertex IE204      =   new Vertex("資電204",     "計算機系統實驗室");
    public static Vertex IE205      =   new Vertex("資電205",     "專題研究室");
    public static Vertex IE206      =   new Vertex("資電206",     "儲藏室");
    public static Vertex IE207      =   new Vertex("資電207",     "無線射頻識別實驗室");
    public static Vertex IE207A     =   new Vertex("資電207A",    "資訊系教授休息室");
    public static Vertex IE207_1    =   new Vertex("資電207-1",   "教授研究室");
    public static Vertex IE208      =   new Vertex("資電208",     "教授研究室");
    public static Vertex IE209      =   new Vertex("資電209",     "教授研究室");
    public static Vertex IE210      =   new Vertex("資電210",     "教授研究室");
    public static Vertex IE211      =   new Vertex("資電211",     "教授研究室");
    public static Vertex IE212      =   new Vertex("資電212",     "教授研究室");
    public static Vertex IE213      =   new Vertex("資電213",     "教授研究室");
    public static Vertex IE214      =   new Vertex("資電214",     "教授研究室");
    public static Vertex IE215      =   new Vertex("資電215",     "教授研究室");
    public static Vertex IE216      =   new Vertex("資電216",     "教授研究室");
    public static Vertex IE217      =   new Vertex("資電217",     "教授研究室");
    public static Vertex IE218      =   new Vertex("資電218",     "教授研究室");
    public static Vertex IE219      =   new Vertex("資電219",     "教授研究室");
    public static Vertex IE220      =   new Vertex("資電220",     "資電學院會議室");
    public static Vertex IE221      =   new Vertex("資電221",     "儲藏室");
    public static Vertex IE222      =   new Vertex("資電222",     "第三國際會議廳");
    public static Vertex IE222A     =   new Vertex("資電222A",    "控制室");
    public static Vertex IE223      =   new Vertex("資電223",     "貴賓室");
    public static Vertex IE224      =   new Vertex("資電224",     "研討室");
    public static Vertex IE225      =   new Vertex("資電225",     "教授研究室");
    public static Vertex IE226      =   new Vertex("資電226",     "教授研究室");
    public static Vertex IE227      =   new Vertex("資電227",     "教授研究室");
    public static Vertex IE228      =   new Vertex("資電228",     "教授研究室");
    public static Vertex IE229      =   new Vertex("資電229",     "教授研究室");
    public static Vertex IE230      =   new Vertex("資電230",     "低功率系統結構實驗室");
    public static Vertex IE230_1    =   new Vertex("資電230-1",   "教授研究室");
    public static Vertex IE230_2    =   new Vertex("資電230-2",   "教授研究室");
    public static Vertex IE231      =   new Vertex("資電231",     "平行與分散式處理實驗室");
    public static Vertex IE231_1    =   new Vertex("資電231-1",   "教授研究室");
    public static Vertex IE231_2    =   new Vertex("資電231-2",   "教授研究室");
    public static Vertex IE232      =   new Vertex("資電232",     "行動計算實驗室");
    public static Vertex IE232_1    =   new Vertex("資電232-1",   "教授研究室");
    public static Vertex IE232_2    =   new Vertex("資電232-2",   "教授研究室");
    public static Vertex IE233      =   new Vertex("資電233",     "網路管理實驗室");
    public static Vertex IE234      =   new Vertex("資電234",     "院共同實驗室");
    public static Vertex IE235      =   new Vertex("資電235",     "院共同實驗室");
    public static Vertex IE236      =   new Vertex("資電236",     "資訊書庫");
    public static Vertex IE237      =   new Vertex("資電237",     "研討室");
    public static Vertex IE238      =   new Vertex("資電238",     "教授研究室");
    public static Vertex IE238_1    =   new Vertex("資電238-1",   "教授研究室");
    public static Vertex IE239      =   new Vertex("資電239",     "教授研究室");
    public static Vertex IE240      =   new Vertex("資電240",     "教授研究室");
    public static Vertex IE241      =   new Vertex("資電241",     "教授研究室");
    public static Vertex IE241_1    =   new Vertex("資電241-1",   "儲藏室");
    public static Vertex IE242      =   new Vertex("資電242",     "資訊安全實驗室");
    public static Vertex IE242_1    =   new Vertex("資電242-1",   "資訊安全實驗室");
    public static Vertex IE243      =   new Vertex("資電243",     "軟體工程實驗室(II)");
    public static Vertex IE244      =   new Vertex("資電244",     "生物資訊實驗室");
    public static Vertex IE245      =   new Vertex("資電245",     "軟體工程實驗室(I)");
    public static Vertex IE246      =   new Vertex("資電246",     "VLSI實驗室");
    public static Vertex IE247      =   new Vertex("資電247",     "研討室");
    public static Vertex IE248      =   new Vertex("資電248",     "院共同實驗室");
    public static Vertex IE249      =   new Vertex("資電249",     "無線網路實驗室");
    public static Vertex IE250      =   new Vertex("資電250",     "男廁所");
    public static Vertex IE251      =   new Vertex("資電251",     "女廁所");
    public static Vertex IE252      =   new Vertex("資電252",     "女廁所");
    public static Vertex IE253      =   new Vertex("資電253",     "男廁所");
    public static Vertex IE254      =   new Vertex("資電254",     "空調室");
    public static Vertex IE255      =   new Vertex("資電255",     "女廁所");
    public static Vertex IE256      =   new Vertex("資電256",     "男廁所");

    public ArrayList<DefaultWeightedEdge> getRoadEdgeList() {
        return roadEdgeList;
    }

    public ArrayList<Vertex> getVertexList() {
        return vertexList;
    }

    public Graph() {
        super(DefaultWeightedEdge.class);
        addVertex();
        addEdge();
    }

    public DefaultWeightedEdge addWeightedEdge (Vertex v1, Vertex v2, double weight) {
//        if (!containsVertex(v1))
//            addVertex(v1);
//        if (!containsVertex(v2))
//            addVertex(v2);
        DefaultWeightedEdge e = new DefaultWeightedEdge();
        addEdge(v1, v2, e);
        setEdgeWeight(e, weight);
        return e;
    }

    public void modifyWeightedEdge (DefaultWeightedEdge e, double weight) {
        setEdgeWeight(e, weight);
    }

    public void modifyWeightedEdge (Vertex v1, Vertex v2, double weight) {
        DefaultWeightedEdge e = getEdge(v1, v2);
        setEdgeWeight(e, weight);
    }

    private static double cmToM(double d) {
        return d/100;
    }

    static ArrayList<DefaultWeightedEdge> roadEdgeList;
    private void addEdge() {
        roadEdgeList = new ArrayList<>();

        //CORNER_A to CORNER_B
        roadEdgeList.add(addWeightedEdge(CORNER_A, NODE1, cmToM(825)));
        roadEdgeList.add(addWeightedEdge(NODE1, NODE2, cmToM(700)));
        roadEdgeList.add(addWeightedEdge(NODE2, NODE3, cmToM(700)));
        roadEdgeList.add(addWeightedEdge(NODE3, CORNER_B, cmToM(875)));
        //CORNER_A to CORNER_B

        //CORNER_B to CORNER_C
        roadEdgeList.add(addWeightedEdge(CORNER_B, CORNER_C, cmToM(105000)));

        //CORNER_C to CORNER_D
        roadEdgeList.add(addWeightedEdge(CORNER_C, NODE6, cmToM(525)));
        roadEdgeList.add(addWeightedEdge(NODE6, NODE5, cmToM(1050)));
        roadEdgeList.add(addWeightedEdge(NODE5, NODE4, cmToM(1400)));
        roadEdgeList.add(addWeightedEdge(NODE4, CORNER_D, cmToM(125)));
        //CORNER_C to CORNER_D

        //CORNER_D to CORNER_A
        roadEdgeList.add(addWeightedEdge(CORNER_D, NODE16, cmToM(525)));
        roadEdgeList.add(addWeightedEdge(NODE16, CORNER_A, cmToM(525)));
        //CORNER_D to CORNER_A

        roadEdgeList.add(addWeightedEdge(CORNER_D, NODE7, cmToM(575)));
        roadEdgeList.add(addWeightedEdge(NODE8, CORNER_A, cmToM(525)));
        roadEdgeList.add(addWeightedEdge(NODE9, NODE8, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE10, NODE9, cmToM(312)));
        roadEdgeList.add(addWeightedEdge(NODE11, NODE10, cmToM(412.5)));

        roadEdgeList.add(addWeightedEdge(CORNER_C, NODE14, cmToM(525)));
        roadEdgeList.add(addWeightedEdge(NODE14, NODE15, cmToM(350)));

        roadEdgeList.add(addWeightedEdge(NODE13, CORNER_B, cmToM(175)));
        roadEdgeList.add(addWeightedEdge(NODE12, NODE13, cmToM(525)));

        roadEdgeList.add(addWeightedEdge(NODE15, NODE17, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE17, NODE18, cmToM(660)));
        roadEdgeList.add(addWeightedEdge(NODE18, NODE19, cmToM(700)));
        roadEdgeList.add(addWeightedEdge(NODE19, NODE20, cmToM(525)));
        roadEdgeList.add(addWeightedEdge(NODE20, CORNER_E, cmToM(600)));
        roadEdgeList.add(addWeightedEdge(CORNER_E, NODE24, cmToM(625)));
        roadEdgeList.add(addWeightedEdge(NODE24, NODE25, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE25, CORNER_F, cmToM(475)));
        roadEdgeList.add(addWeightedEdge(CORNER_F, NODE26, cmToM(575)));

        roadEdgeList.add(addWeightedEdge(CORNER_E, NODE23, cmToM(541)));
        roadEdgeList.add(addWeightedEdge(NODE23, NODE22, cmToM(1384)));
        roadEdgeList.add(addWeightedEdge(NODE22, NODE21, cmToM(2198)));

        roadEdgeList.add(addWeightedEdge(CORNER_F, NODE27, cmToM(333)));
        roadEdgeList.add(addWeightedEdge(IE206, NODE27, cmToM(125)));
        roadEdgeList.add(addWeightedEdge(NODE27, CORNER_G, cmToM(375)));

        roadEdgeList.add(addWeightedEdge(CORNER_G, NODE28, cmToM(382.5)));
        roadEdgeList.add(addWeightedEdge(NODE28, NODE29, cmToM(167)));
        roadEdgeList.add(addWeightedEdge(NODE29, NODE30, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE30, NODE31, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE31, NODE32, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE32, NODE33, cmToM(350)));

        roadEdgeList.add(addWeightedEdge(CORNER_G, NODE34, cmToM(382.5)));
        roadEdgeList.add(addWeightedEdge(NODE34, NODE35, cmToM(167)));
        roadEdgeList.add(addWeightedEdge(NODE35, NODE36, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE36, NODE37, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE37, NODE38, cmToM(350)));
        roadEdgeList.add(addWeightedEdge(NODE38, NODE39, cmToM(350)));

        addWeightedEdge(IE240, NODE11, cmToM(38));
        addWeightedEdge(IE241, NODE11, cmToM(38));
        addWeightedEdge(IE239, NODE10, cmToM(38));
        addWeightedEdge(IE238, NODE10, cmToM(38));
        addWeightedEdge(IE238, IE238_1, cmToM(412));

        addWeightedEdge(IE241_1, NODE9, cmToM(125));
        addWeightedEdge(STAIR2, NODE8, cmToM(125));
        addWeightedEdge(IE242, CORNER_A, cmToM(125));
        addWeightedEdge(IE242_1, NODE16, cmToM(125));

        addWeightedEdge(IE252, NODE7, cmToM(125));
        addWeightedEdge(IE253, NODE7, cmToM(125));
        addWeightedEdge(IE243, CORNER_D, cmToM(125));
        addWeightedEdge(IE244, NODE4, cmToM(125));
        addWeightedEdge(IE245, NODE5, cmToM(125));
        addWeightedEdge(IE246, NODE5, cmToM(125));
        addWeightedEdge(IE247, NODE6, cmToM(125));
        addWeightedEdge(IE248, NODE14, cmToM(125));
        addWeightedEdge(IE249, NODE14, cmToM(125));
        addWeightedEdge(STAIR1, NODE15, cmToM(125));

        addWeightedEdge(IE237, CORNER_C, cmToM(175));
        addWeightedEdge(IE224, CORNER_C, cmToM(175));
        addWeightedEdge(IE225, CORNER_B, cmToM(175));
        addWeightedEdge(IE226, NODE13, cmToM(175));
        addWeightedEdge(IE227, NODE12, cmToM(175));
        addWeightedEdge(IE228, NODE12, cmToM(175));
        addWeightedEdge(IE229, NODE12, cmToM(175));

        addWeightedEdge(IE230, NODE3, cmToM(175));
        addWeightedEdge(IE230, IE230_1, cmToM(700));
        addWeightedEdge(IE230, IE230_2, cmToM(700));
        addWeightedEdge(IE230_1, IE230_2, cmToM(100));
        addWeightedEdge(IE231, NODE2, cmToM(175));
        addWeightedEdge(IE231, IE231_1, cmToM(700));
        addWeightedEdge(IE231, IE231_2, cmToM(700));
        addWeightedEdge(IE231_1, IE231_2, cmToM(100));
        addWeightedEdge(IE232, NODE2, cmToM(175));
        addWeightedEdge(IE232, IE232_1, cmToM(700));
        addWeightedEdge(IE232, IE232_2, cmToM(700));
        addWeightedEdge(IE232_1, IE232_2, cmToM(100));
        addWeightedEdge(IE233, NODE1, cmToM(100));
        addWeightedEdge(IE234, NODE2, cmToM(100));
        addWeightedEdge(IE235, NODE2, cmToM(100));
        addWeightedEdge(IE236, NODE3, cmToM(100));

        addWeightedEdge(IE201, NODE17, cmToM(125));
        addWeightedEdge(IE201, NODE17, cmToM(125));
        addWeightedEdge(IE201, IE201_1, cmToM(1010));
        addWeightedEdge(IE254, NODE17, cmToM(200));
        addWeightedEdge(ELEVATOR_A, NODE17, cmToM(200));
        addWeightedEdge(IE222A, NODE18, cmToM(200));
        addWeightedEdge(ELEVATOR_B, NODE18, cmToM(200));
        addWeightedEdge(IE223, NODE18, cmToM(125));
        addWeightedEdge(IE222, NODE19, cmToM(200));
        addWeightedEdge(IE222, NODE21, cmToM(1500));
        addWeightedEdge(IE222, NODE22, cmToM(1500));
        addWeightedEdge(IE221, NODE20, cmToM(125));
        addWeightedEdge(IE202, NODE20, cmToM(125));
        addWeightedEdge(IE202, IE202_1, cmToM(175));
        addWeightedEdge(IE203, CORNER_E, cmToM(125));
        addWeightedEdge(IE220, NODE24, cmToM(125));
        addWeightedEdge(IE204, NODE25, cmToM(125));
        addWeightedEdge(IE205, CORNER_F, cmToM(125));
        addWeightedEdge(IE250, NODE26, cmToM(125));
        addWeightedEdge(IE251, NODE26, cmToM(125));

        addWeightedEdge(IE207, CORNER_G, cmToM(167));
        addWeightedEdge(IE207, IE207_1, cmToM(1400));

        addWeightedEdge(IE208, NODE28, cmToM(75));
        addWeightedEdge(IE209, NODE29, cmToM(75));
        addWeightedEdge(IE210, NODE30, cmToM(75));
        addWeightedEdge(IE211, NODE31, cmToM(75));
        addWeightedEdge(IE212, NODE32, cmToM(75));
        addWeightedEdge(IE213, NODE33, cmToM(75));

        addWeightedEdge(IE207A, NODE34, cmToM(75));
        addWeightedEdge(IE214, NODE35, cmToM(75));
        addWeightedEdge(IE215, NODE36, cmToM(75));
        addWeightedEdge(IE216, NODE37, cmToM(75));
        addWeightedEdge(IE217, NODE38, cmToM(75));
        addWeightedEdge(IE218, NODE39, cmToM(75));
        addWeightedEdge(IE219, NODE39, cmToM(75));

        addWeightedEdge(STAIR3, NODE27, cmToM(382.5));
    }

    static ArrayList<Vertex> vertexList;
    private void addVertex() {
        vertexList = new ArrayList<>();
        vertexList.add(IE201);
        vertexList.add(IE201_1);
        vertexList.add(IE202);
        vertexList.add(IE202_1);
        vertexList.add(IE203);
        vertexList.add(IE204);
        vertexList.add(IE205);
        vertexList.add(IE206);
        vertexList.add(IE207);
        vertexList.add(IE207_1);
        vertexList.add(IE207A);
        vertexList.add(IE208);
        vertexList.add(IE209);
        vertexList.add(IE210);
        vertexList.add(IE211);
        vertexList.add(IE212);
        vertexList.add(IE213);
        vertexList.add(IE214);
        vertexList.add(IE215);
        vertexList.add(IE216);
        vertexList.add(IE217);
        vertexList.add(IE218);
        vertexList.add(IE219);
        vertexList.add(IE220);
        vertexList.add(IE221);
        vertexList.add(IE222);
        vertexList.add(IE222A);
        vertexList.add(IE223);
        vertexList.add(IE224);
        vertexList.add(IE225);
        vertexList.add(IE226);
        vertexList.add(IE227);
        vertexList.add(IE228);
        vertexList.add(IE229);
        vertexList.add(IE230);
        vertexList.add(IE230_1);
        vertexList.add(IE230_2);
        vertexList.add(IE231);
        vertexList.add(IE231_1);
        vertexList.add(IE231_2);
        vertexList.add(IE232);
        vertexList.add(IE232_1);
        vertexList.add(IE232_2);
        vertexList.add(IE233);
        vertexList.add(IE234);
        vertexList.add(IE235);
        vertexList.add(IE236);
        vertexList.add(IE237);
        vertexList.add(IE238);
        vertexList.add(IE238_1);
        vertexList.add(IE239);
        vertexList.add(IE240);
        vertexList.add(IE241);
        vertexList.add(IE241_1);
        vertexList.add(IE242);
        vertexList.add(IE242_1);
        vertexList.add(IE243);
        vertexList.add(IE244);
        vertexList.add(IE245);
        vertexList.add(IE246);
        vertexList.add(IE247);
        vertexList.add(IE248);
        vertexList.add(IE249);
        vertexList.add(IE250);
        vertexList.add(IE251);
        vertexList.add(IE252);
        vertexList.add(IE253);
        vertexList.add(IE254);
        vertexList.add(IE255);
        vertexList.add(IE256);
        vertexList.add(CORNER_A);
        vertexList.add(CORNER_B);
        vertexList.add(CORNER_C);
        vertexList.add(CORNER_D);
        vertexList.add(CORNER_E);
        vertexList.add(CORNER_F);
        vertexList.add(CORNER_G);
        vertexList.add(STAIR1);
        vertexList.add(STAIR2);
        vertexList.add(STAIR3);
        vertexList.add(ELEVATOR_A);
        vertexList.add(ELEVATOR_B);
        vertexList.add(NODE1);
        vertexList.add(NODE2);
        vertexList.add(NODE3);
        vertexList.add(NODE4);
        vertexList.add(NODE5);
        vertexList.add(NODE6);
        vertexList.add(NODE7);
        vertexList.add(NODE8);
        vertexList.add(NODE9);
        vertexList.add(NODE10);
        vertexList.add(NODE11);
        vertexList.add(NODE12);
        vertexList.add(NODE13);
        vertexList.add(NODE14);
        vertexList.add(NODE15);
        vertexList.add(NODE16);
        vertexList.add(NODE17);
        vertexList.add(NODE18);
        vertexList.add(NODE19);
        vertexList.add(NODE20);
        vertexList.add(NODE21);
        vertexList.add(NODE22);
        vertexList.add(NODE23);
        vertexList.add(NODE24);
        vertexList.add(NODE25);
        vertexList.add(NODE26);
        vertexList.add(NODE27);
        vertexList.add(NODE28);
        vertexList.add(NODE29);
        vertexList.add(NODE30);
        vertexList.add(NODE31);
        vertexList.add(NODE32);
        vertexList.add(NODE33);
        vertexList.add(NODE34);
        vertexList.add(NODE35);
        vertexList.add(NODE36);
        vertexList.add(NODE37);
        vertexList.add(NODE38);
        vertexList.add(NODE39);
        vertexList.forEach(this::addVertex);
    }

    @Override
    public String toString() {
        System.out.println("Nodes");
        for( Vertex v : vertexSet())
            System.out.print(v + " ");
        System.out.println(".");

        System.out.println("Edges");
        for( DefaultWeightedEdge edge: edgeSet())
            System.out.println(getEdgeSource(edge)+","+getEdgeTarget(edge)+"="+getEdgeWeight(edge));
        return super.toString();
    }

}
