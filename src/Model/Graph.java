package Model;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.ArrayList;

/**
 * Created by Wood on 2015/8/18.
 */
public class Graph extends SimpleWeightedGraph<Vertex, DefaultWeightedEdge> {
    public static int VERTRX_SIZE = 76;
    public static int EDGE_SIZE = 43;
    final Vertex CORNER_A   =   new Vertex("轉角A",       "轉角A");
    final Vertex CORNER_B   =   new Vertex("轉角B",       "轉角B");
    final Vertex CORNER_C   =   new Vertex("轉角C",       "轉角C");
    final Vertex CORNER_D   =   new Vertex("轉角D",       "轉角D");
    final Vertex CORNER_E   =   new Vertex("轉角E",       "轉角E");
    final Vertex CORNER_F   =   new Vertex("轉角F",       "轉角F");
    final Vertex CORNER_G   =   new Vertex("轉角G",       "轉角G");
    final Vertex ELEVATOR_A =   new Vertex("電梯A",       "電梯A");
    final Vertex ELEVATOR_B =   new Vertex("電梯B",       "電梯B");
    final Vertex STAIR1     =   new Vertex("樓梯1",       "樓梯1");
    final Vertex STAIR2     =   new Vertex("樓梯2",       "樓梯2");
    final Vertex STAIR3     =   new Vertex("樓梯3",       "樓梯3");
    final Vertex NODE1      =   new Vertex("節點1",       "節點1");
    final Vertex NODE2      =   new Vertex("節點2",       "節點2");
    final Vertex NODE3      =   new Vertex("節點3",       "節點3");
    final Vertex NODE4      =   new Vertex("節點4",       "節點4");
    final Vertex NODE5      =   new Vertex("節點5",       "節點5");
    final Vertex NODE6      =   new Vertex("節點6",       "節點6");
    final Vertex NODE7      =   new Vertex("節點7",       "節點7");
    final Vertex NODE8      =   new Vertex("節點8",       "節點8");
    final Vertex NODE9      =   new Vertex("節點9",       "節點9");
    final Vertex NODE10     =   new Vertex("節點10",      "節點10");
    final Vertex NODE11     =   new Vertex("節點11",      "節點11");
    final Vertex NODE12     =   new Vertex("節點12",      "節點12");
    final Vertex NODE13     =   new Vertex("節點13",      "節點13");
    final Vertex NODE14     =   new Vertex("節點14",      "節點14");
    final Vertex NODE15     =   new Vertex("節點15",      "節點15");
    final Vertex NODE16     =   new Vertex("節點16",      "節點16");
    final Vertex NODE17     =   new Vertex("節點17",      "節點17");
    final Vertex NODE18     =   new Vertex("節點18",      "節點18");
    final Vertex NODE19     =   new Vertex("節點19",      "節點19");
    final Vertex NODE20     =   new Vertex("節點20",      "節點20");
    final Vertex NODE21     =   new Vertex("節點21",      "節點21");
    final Vertex NODE22     =   new Vertex("節點22",      "節點22");
    final Vertex NODE23     =   new Vertex("節點23",      "節點23");
    final Vertex NODE24     =   new Vertex("節點24",      "節點24");
    final Vertex NODE25     =   new Vertex("節點25",      "節點25");
    final Vertex NODE26     =   new Vertex("節點26",      "節點26");
    final Vertex NODE27     =   new Vertex("節點27",      "節點27");
    final Vertex NODE28     =   new Vertex("節點28",      "節點28");
    final Vertex NODE29     =   new Vertex("節點29",      "節點29");
    final Vertex NODE30     =   new Vertex("節點30",      "節點30");
    final Vertex NODE31     =   new Vertex("節點31",      "節點31");
    final Vertex NODE32     =   new Vertex("節點32",      "節點32");
    final Vertex NODE33     =   new Vertex("節點33",      "節點33");
    final Vertex NODE34     =   new Vertex("節點34",      "節點34");
    final Vertex NODE35     =   new Vertex("節點35",      "節點35");
    final Vertex NODE36     =   new Vertex("節點36",      "節點36");
    final Vertex NODE37     =   new Vertex("節點37",      "節點37");
    final Vertex NODE38     =   new Vertex("節點38",      "節點38");
    final Vertex NODE39     =   new Vertex("節點39",      "節點39");
    final Vertex IE201      =   new Vertex("資電201",     "資訊系辦公室");
    final Vertex IE201_1    =   new Vertex("資電201-1",   "主任辦公室");
    final Vertex IE202      =   new Vertex("資電202",     "資電學院辦公室");
    final Vertex IE202_1    =   new Vertex("資電202-1",   "院長辦公室");
    final Vertex IE203      =   new Vertex("資電203",     "研討室");
    final Vertex IE204      =   new Vertex("資電204",     "計算機系統實驗室");
    final Vertex IE205      =   new Vertex("資電205",     "專題研究室");
    final Vertex IE206      =   new Vertex("資電206",     "儲藏室");
    final Vertex IE207      =   new Vertex("資電207",     "無線射頻識別實驗室");
    final Vertex IE207A     =   new Vertex("資電207A",    "資訊系教授休息室");
    final Vertex IE207_1    =   new Vertex("資電207-1",   "教授研究室");
    final Vertex IE208      =   new Vertex("資電208",     "教授研究室");
    final Vertex IE209      =   new Vertex("資電209",     "教授研究室");
    final Vertex IE210      =   new Vertex("資電210",     "教授研究室");
    final Vertex IE211      =   new Vertex("資電211",     "教授研究室");
    final Vertex IE212      =   new Vertex("資電212",     "教授研究室");
    final Vertex IE213      =   new Vertex("資電213",     "教授研究室");
    final Vertex IE214      =   new Vertex("資電214",     "教授研究室");
    final Vertex IE215      =   new Vertex("資電215",     "教授研究室");
    final Vertex IE216      =   new Vertex("資電216",     "教授研究室");
    final Vertex IE217      =   new Vertex("資電217",     "教授研究室");
    final Vertex IE218      =   new Vertex("資電218",     "教授研究室");
    final Vertex IE219      =   new Vertex("資電219",     "教授研究室");
    final Vertex IE220      =   new Vertex("資電220",     "資電學院會議室");
    final Vertex IE221      =   new Vertex("資電221",     "儲藏室");
    final Vertex IE222      =   new Vertex("資電222",     "第三國際會議廳");
    final Vertex IE222A     =   new Vertex("資電222A",    "控制室");
    final Vertex IE223      =   new Vertex("資電223",     "貴賓室");
    final Vertex IE224      =   new Vertex("資電224",     "研討室");
    final Vertex IE225      =   new Vertex("資電225",     "教授研究室");
    final Vertex IE226      =   new Vertex("資電226",     "教授研究室");
    final Vertex IE227      =   new Vertex("資電227",     "教授研究室");
    final Vertex IE228      =   new Vertex("資電228",     "教授研究室");
    final Vertex IE229      =   new Vertex("資電229",     "教授研究室");
    final Vertex IE230      =   new Vertex("資電230",     "低功率系統結構實驗室");
    final Vertex IE231      =   new Vertex("資電231",     "平行與分散式處理實驗室");
    final Vertex IE232      =   new Vertex("資電232",     "行動計算實驗室");
    final Vertex IE233      =   new Vertex("資電233",     "網路管理實驗室");
    final Vertex IE234      =   new Vertex("資電234",     "院共同實驗室");
    final Vertex IE235      =   new Vertex("資電235",     "院共同實驗室");
    final Vertex IE236      =   new Vertex("資電236",     "資訊書庫");
    final Vertex IE237      =   new Vertex("資電237",     "研討室");
    final Vertex IE238      =   new Vertex("資電238",     "教授研究室");
    final Vertex IE238_1    =   new Vertex("資電238-1",   "教授研究室");
    final Vertex IE239      =   new Vertex("資電239",     "教授研究室");
    final Vertex IE240      =   new Vertex("資電240",     "教授研究室");
    final Vertex IE241      =   new Vertex("資電241",     "教授研究室");
    final Vertex IE241_1    =   new Vertex("資電241-1",   "儲藏室");
    final Vertex IE242      =   new Vertex("資電242",     "資訊安全實驗室");
    final Vertex IE242_1    =   new Vertex("資電242-1",   "資訊安全實驗室");
    final Vertex IE243      =   new Vertex("資電243",     "軟體工程實驗室(II)");
    final Vertex IE244      =   new Vertex("資電244",     "生物資訊實驗室");
    final Vertex IE245      =   new Vertex("資電245",     "軟體工程實驗室(I)");
    final Vertex IE246      =   new Vertex("資電246",     "VLSI實驗室");
    final Vertex IE247      =   new Vertex("資電247",     "研討室");
    final Vertex IE248      =   new Vertex("資電248",     "院共同實驗室");
    final Vertex IE249      =   new Vertex("資電249",     "無線網路實驗室");
    final Vertex IE250      =   new Vertex("資電250",     "男廁所");
    final Vertex IE251      =   new Vertex("資電251",     "女廁所");
    final Vertex IE252      =   new Vertex("資電252",     "女廁所");
    final Vertex IE253      =   new Vertex("資電253",     "男廁所");
    final Vertex IE254      =   new Vertex("資電254",     "空調室");
    final Vertex IE255      =   new Vertex("資電255",     "女廁所");
    final Vertex IE256      =   new Vertex("資電256",     "男廁所");

    public ArrayList<Edge> getRoadEdgeList() {
        return new ArrayList<>(roadEdgeList);
    }

    public ArrayList<Vertex> getVertexList() {
        return new ArrayList<>(vertexList);
    }

    public Graph() {
        super(Edge.class);
        addVertex();
        insertEdge();
    }

    public Edge insertEdge(Vertex v1, Vertex v2, double roadLength, double roadWidth) {
        Edge e = new Edge(roadLength, roadWidth);
        addEdge(v1, v2, e);
        setEdgeWeight(e, roadLength);
        return e;
    }

    public Vertex insertVertex(Vertex v) {
        addVertex(v);
        return v;
    }

    private double cmToM(double d) {
        return d/100;
    }

    ArrayList<Edge> roadEdgeList;
    private void insertEdge() {
        roadEdgeList = new ArrayList<>();

        //CORNER_A to CORNER_B
        roadEdgeList.add(insertEdge(CORNER_A, NODE1, cmToM(825), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE1, NODE2, cmToM(700), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE2, NODE3, cmToM(700), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE3, CORNER_B, cmToM(875), cmToM(175)));
        //CORNER_A to CORNER_B

        //CORNER_B to CORNER_C
        roadEdgeList.add(insertEdge(CORNER_B, CORNER_C, cmToM(105000), cmToM(175)));

        //CORNER_C to CORNER_D
        roadEdgeList.add(insertEdge(CORNER_C, NODE6, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE6, NODE5, cmToM(1050), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE5, NODE4, cmToM(1400), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE4, CORNER_D, cmToM(125), cmToM(125)));
        //CORNER_C to CORNER_D

        //CORNER_D to CORNER_A
        roadEdgeList.add(insertEdge(CORNER_D, NODE16, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE16, CORNER_A, cmToM(525), cmToM(125)));
        //CORNER_D to CORNER_A

        roadEdgeList.add(insertEdge(CORNER_D, NODE7, cmToM(575), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE8, CORNER_A, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE9, NODE8, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE10, NODE9, cmToM(312), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE11, NODE10, cmToM(412.5), cmToM(76)));

        roadEdgeList.add(insertEdge(CORNER_C, NODE14, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE14, NODE15, cmToM(350), cmToM(125)));

        roadEdgeList.add(insertEdge(NODE13, CORNER_B, cmToM(175), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE12, NODE13, cmToM(525), cmToM(175)));

        roadEdgeList.add(insertEdge(NODE15, NODE17, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE17, NODE18, cmToM(660), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE18, NODE19, cmToM(700), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE19, NODE20, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE20, CORNER_E, cmToM(600), cmToM(125)));
        roadEdgeList.add(insertEdge(CORNER_E, NODE24, cmToM(625), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE24, NODE25, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE25, CORNER_F, cmToM(475), cmToM(125)));
        roadEdgeList.add(insertEdge(CORNER_F, NODE26, cmToM(575), cmToM(125)));

        roadEdgeList.add(insertEdge(CORNER_E, NODE23, cmToM(541), cmToM(62.5)));
        roadEdgeList.add(insertEdge(NODE23, NODE22, cmToM(1384), cmToM(62.5)));
        roadEdgeList.add(insertEdge(NODE22, NODE21, cmToM(2198), cmToM(62.5)));

        roadEdgeList.add(insertEdge(CORNER_F, NODE27, cmToM(333), cmToM(125)));

        roadEdgeList.add(insertEdge(NODE28, NODE29, cmToM(167), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE29, NODE30, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE30, NODE31, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE31, NODE32, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE32, NODE33, cmToM(350), cmToM(75)));

        roadEdgeList.add(insertEdge(NODE34, NODE35, cmToM(167), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE35, NODE36, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE36, NODE37, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE37, NODE38, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE38, NODE39, cmToM(350), cmToM(75)));

        insertEdge(IE206, NODE27, cmToM(125), Double.MIN_VALUE);
        insertEdge(NODE27, CORNER_G, cmToM(375), Double.MIN_VALUE);
        insertEdge(CORNER_G, NODE28, cmToM(382.5), Double.MIN_VALUE);
        insertEdge(CORNER_G, NODE34, cmToM(382.5), Double.MIN_VALUE);
        insertEdge(IE240, NODE11, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE241, NODE11, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE239, NODE10, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE238, NODE10, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE238, IE238_1, cmToM(412), Double.MIN_VALUE);

        insertEdge(IE241_1, NODE9, cmToM(125), Double.MIN_VALUE);
        insertEdge(STAIR2, NODE8, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE242, CORNER_A, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE242_1, NODE16, cmToM(125), Double.MIN_VALUE);

        insertEdge(IE252, NODE7, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE253, NODE7, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE243, CORNER_D, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE244, NODE4, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE245, NODE5, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE246, NODE5, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE247, NODE6, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE248, NODE14, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE249, NODE14, cmToM(125), Double.MIN_VALUE);
        insertEdge(STAIR1, NODE15, cmToM(125), Double.MIN_VALUE);

        insertEdge(IE237, CORNER_C, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE224, CORNER_C, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE225, CORNER_B, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE226, NODE13, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE227, NODE12, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE228, NODE12, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE229, NODE12, cmToM(175), Double.MIN_VALUE);

        insertEdge(IE230, NODE3, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE231, NODE2, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE232, NODE2, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE233, NODE1, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE234, NODE2, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE235, NODE2, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE236, NODE3, cmToM(100), Double.MIN_VALUE);

        insertEdge(IE201, NODE17, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE201, NODE17, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE201, IE201_1, cmToM(1010), Double.MIN_VALUE);
        insertEdge(IE254, NODE17, cmToM(200), Double.MIN_VALUE);
        insertEdge(ELEVATOR_A, NODE17, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE222A, NODE18, cmToM(200), Double.MIN_VALUE);
        insertEdge(ELEVATOR_B, NODE18, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE223, NODE18, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE222, NODE19, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE222, NODE21, cmToM(1500), Double.MIN_VALUE);
        insertEdge(IE222, NODE22, cmToM(1500), Double.MIN_VALUE);
        insertEdge(IE221, NODE20, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE202, NODE20, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE202, IE202_1, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE203, CORNER_E, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE220, NODE24, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE204, NODE25, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE205, CORNER_F, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE250, NODE26, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE251, NODE26, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE255, NODE23, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE256, NODE23, cmToM(75), Double.MIN_VALUE);

        insertEdge(IE207, CORNER_G, cmToM(167), Double.MIN_VALUE);
        insertEdge(IE207, IE207_1, cmToM(1400), Double.MIN_VALUE);

        insertEdge(IE208, NODE28, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE209, NODE29, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE210, NODE30, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE211, NODE31, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE212, NODE32, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE213, NODE33, cmToM(75), Double.MIN_VALUE);

        insertEdge(IE207A, NODE34, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE214, NODE35, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE215, NODE36, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE216, NODE37, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE217, NODE38, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE218, NODE39, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE219, NODE39, cmToM(75), Double.MIN_VALUE);

        insertEdge(STAIR3, NODE27, cmToM(382.5), Double.MIN_VALUE);
    }

    ArrayList<Vertex> vertexList;
    private void addVertex() {
        vertexList = new ArrayList<>();
        vertexList.add(insertVertex(IE201));
        vertexList.add(insertVertex(IE201_1));
        vertexList.add(insertVertex(IE202));
        vertexList.add(insertVertex(IE202_1));
        vertexList.add(insertVertex(IE203));
        vertexList.add(insertVertex(IE204));
        vertexList.add(insertVertex(IE205));
        vertexList.add(insertVertex(IE206));
        vertexList.add(insertVertex(IE207));
        vertexList.add(insertVertex(IE207_1));
        vertexList.add(insertVertex(IE207A));
        vertexList.add(insertVertex(IE208));
        vertexList.add(insertVertex(IE209));
        vertexList.add(insertVertex(IE210));
        vertexList.add(insertVertex(IE211));
        vertexList.add(insertVertex(IE212));
        vertexList.add(insertVertex(IE213));
        vertexList.add(insertVertex(IE214));
        vertexList.add(insertVertex(IE215));
        vertexList.add(insertVertex(IE216));
        vertexList.add(insertVertex(IE217));
        vertexList.add(insertVertex(IE218));
        vertexList.add(insertVertex(IE219));
        vertexList.add(insertVertex(IE220));
        vertexList.add(insertVertex(IE221));
        vertexList.add(insertVertex(IE222));
        vertexList.add(insertVertex(IE222A));
        vertexList.add(insertVertex(IE223));
        vertexList.add(insertVertex(IE224));
        vertexList.add(insertVertex(IE225));
        vertexList.add(insertVertex(IE226));
        vertexList.add(insertVertex(IE227));
        vertexList.add(insertVertex(IE228));
        vertexList.add(insertVertex(IE229));
        vertexList.add(insertVertex(IE230));
        vertexList.add(insertVertex(IE231));
        vertexList.add(insertVertex(IE232));
        vertexList.add(insertVertex(IE233));
        vertexList.add(insertVertex(IE234));
        vertexList.add(insertVertex(IE235));
        vertexList.add(insertVertex(IE236));
        vertexList.add(insertVertex(IE237));
        vertexList.add(insertVertex(IE238));
        vertexList.add(insertVertex(IE238_1));
        vertexList.add(insertVertex(IE239));
        vertexList.add(insertVertex(IE240));
        vertexList.add(insertVertex(IE241));
        vertexList.add(insertVertex(IE241_1));
        vertexList.add(insertVertex(IE242));
        vertexList.add(insertVertex(IE242_1));
        vertexList.add(insertVertex(IE243));
        vertexList.add(insertVertex(IE244));
        vertexList.add(insertVertex(IE245));
        vertexList.add(insertVertex(IE246));
        vertexList.add(insertVertex(IE247));
        vertexList.add(insertVertex(IE248));
        vertexList.add(insertVertex(IE249));
        vertexList.add(insertVertex(IE250));
        vertexList.add(insertVertex(IE251));
        vertexList.add(insertVertex(IE252));
        vertexList.add(insertVertex(IE253));
        vertexList.add(insertVertex(IE254));
        vertexList.add(insertVertex(IE255));
        vertexList.add(insertVertex(IE256));
        vertexList.add(insertVertex(CORNER_A));
        vertexList.add(insertVertex(CORNER_B));
        vertexList.add(insertVertex(CORNER_C));
        vertexList.add(insertVertex(CORNER_D));
        vertexList.add(insertVertex(CORNER_E));
        vertexList.add(insertVertex(CORNER_F));
        vertexList.add(insertVertex(CORNER_G));
        vertexList.add(insertVertex(STAIR1));
        vertexList.add(insertVertex(STAIR2));
        vertexList.add(insertVertex(STAIR3));
        vertexList.add(insertVertex(ELEVATOR_A));
        vertexList.add(insertVertex(ELEVATOR_B));
        insertVertex(NODE1);
        insertVertex(NODE2);
        insertVertex(NODE3);
        insertVertex(NODE4);
        insertVertex(NODE5);
        insertVertex(NODE6);
        insertVertex(NODE7);
        insertVertex(NODE8);
        insertVertex(NODE9);
        insertVertex(NODE10);
        insertVertex(NODE11);
        insertVertex(NODE12);
        insertVertex(NODE13);
        insertVertex(NODE14);
        insertVertex(NODE15);
        insertVertex(NODE16);
        insertVertex(NODE17);
        insertVertex(NODE18);
        insertVertex(NODE19);
        insertVertex(NODE20);
        insertVertex(NODE21);
        insertVertex(NODE22);
        insertVertex(NODE23);
        insertVertex(NODE24);
        insertVertex(NODE25);
        insertVertex(NODE26);
        insertVertex(NODE27);
        insertVertex(NODE28);
        insertVertex(NODE29);
        insertVertex(NODE30);
        insertVertex(NODE31);
        insertVertex(NODE32);
        insertVertex(NODE33);
        insertVertex(NODE34);
        insertVertex(NODE35);
        insertVertex(NODE36);
        insertVertex(NODE37);
        insertVertex(NODE38);
        insertVertex(NODE39);
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