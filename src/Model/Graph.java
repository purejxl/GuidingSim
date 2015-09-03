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
    final Vertex CORNER_2A  =   new Vertex("轉角2A",      "轉角2A");
    final Vertex CORNER_2B  =   new Vertex("轉角2B",      "轉角2B");
    final Vertex CORNER_2C  =   new Vertex("轉角2C",      "轉角2C");
    final Vertex CORNER_2D  =   new Vertex("轉角2D",      "轉角2D");
    final Vertex CORNER_2E  =   new Vertex("轉角2E",      "轉角2E");
    final Vertex CORNER_2F  =   new Vertex("轉角2F",      "轉角2F");
    final Vertex CORNER_2G  =   new Vertex("轉角2G",      "轉角2G");
    final Vertex ELEVATOR_A =   new Vertex("電梯A",       "電梯A");
    final Vertex ELEVATOR_B =   new Vertex("電梯B",       "電梯B");
    final Vertex STAIR0201  =   new Vertex("樓梯0201",    "樓梯0201");
    final Vertex STAIR0202  =   new Vertex("樓梯0202",    "樓梯0202");
    final Vertex STAIR0203  =   new Vertex("樓梯0203",    "樓梯0203");
    final Vertex NODE0201   =   new Vertex("節點0201",    "節點0201");
    final Vertex NODE0202   =   new Vertex("節點0202",    "節點0202");
    final Vertex NODE0203   =   new Vertex("節點0203",    "節點0203");
    final Vertex NODE0204   =   new Vertex("節點0204",    "節點0204");
    final Vertex NODE0205   =   new Vertex("節點0205",    "節點0205");
    final Vertex NODE0206   =   new Vertex("節點0206",    "節點0206");
    final Vertex NODE0207   =   new Vertex("節點0207",    "節點0207");
    final Vertex NODE0208   =   new Vertex("節點0208",    "節點0208");
    final Vertex NODE0209   =   new Vertex("節點0209",    "節點0209");
    final Vertex NODE0210   =   new Vertex("節點0210",    "節點0210");
    final Vertex NODE0211   =   new Vertex("節點0211",    "節點0211");
    final Vertex NODE0212   =   new Vertex("節點0212",    "節點0212");
    final Vertex NODE0213   =   new Vertex("節點0213",    "節點0213");
    final Vertex NODE0214   =   new Vertex("節點0214",    "節點0214");
    final Vertex NODE0215   =   new Vertex("節點0215",    "節點0215");
    final Vertex NODE0216   =   new Vertex("節點0216",    "節點0216");
    final Vertex NODE0217   =   new Vertex("節點0217",    "節點0217");
    final Vertex NODE0218   =   new Vertex("節點0218",    "節點0218");
    final Vertex NODE0219   =   new Vertex("節點0219",    "節點0219");
    final Vertex NODE0220   =   new Vertex("節點0220",    "節點0220");
    final Vertex NODE0221   =   new Vertex("節點0221",    "節點0221");
    final Vertex NODE0222   =   new Vertex("節點0222",    "節點0222");
    final Vertex NODE0223   =   new Vertex("節點0223",    "節點0223");
    final Vertex NODE0224   =   new Vertex("節點0224",    "節點0224");
    final Vertex NODE0225   =   new Vertex("節點0225",    "節點0225");
    final Vertex NODE0226   =   new Vertex("節點0226",    "節點0226");
    final Vertex NODE0227   =   new Vertex("節點0227",    "節點0227");
    final Vertex NODE0228   =   new Vertex("節點0228",    "節點0228");
    final Vertex NODE0229   =   new Vertex("節點0229",    "節點0229");
    final Vertex NODE0230   =   new Vertex("節點0230",    "節點0230");
    final Vertex NODE0231   =   new Vertex("節點0231",    "節點0231");
    final Vertex NODE0232   =   new Vertex("節點0232",    "節點0232");
    final Vertex NODE0233   =   new Vertex("節點0233",    "節點0233");
    final Vertex NODE0234   =   new Vertex("節點0234",    "節點0234");
    final Vertex NODE0235   =   new Vertex("節點0235",    "節點0235");
    final Vertex NODE0236   =   new Vertex("節點0236",    "節點0236");
    final Vertex NODE0237   =   new Vertex("節點0237",    "節點0237");
    final Vertex NODE0238   =   new Vertex("節點0238",    "節點0238");
    final Vertex NODE0239   =   new Vertex("節點0239",    "節點0239");

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

    final Vertex IE101      =   new Vertex("資電101",     "資訊電機學院會議室");
    final Vertex IE102      =   new Vertex("資電102",     "教室");
    final Vertex IE103      =   new Vertex("資電103",     "教室");
    final Vertex IE104      =   new Vertex("資電104",     "教室");
    final Vertex IE106      =   new Vertex("資電106",     "國語文教學中心");
    final Vertex IE107      =   new Vertex("資電107",     "教室");
    final Vertex IE108      =   new Vertex("資電108",     "語文自學中心教室");
    final Vertex IE109      =   new Vertex("資電109",     "語文自學中心教室");
    final Vertex IE110      =   new Vertex("資電110",     "外語教學中心");
    final Vertex IE119      =   new Vertex("資電119",     "系統維運組");
    final Vertex IE120      =   new Vertex("資電120",     "OIT網路資料中心");
    final Vertex IE121      =   new Vertex("資電121",     "PC維修");
    final Vertex IE122      =   new Vertex("資電122",     "視聽資源辦公室");
    final Vertex IE123      =   new Vertex("資電123",     "資訊管理中心辦公室(二)");
    final Vertex IE124      =   new Vertex("資電124",     "資訊管理中心辦公室(一)");
    final Vertex IE125      =   new Vertex("資電125",     "電腦實習教室");
    final Vertex IE126      =   new Vertex("資電126",     "男廁所");
    final Vertex IE127      =   new Vertex("資電127",     "女廁所");
    final Vertex IE128      =   new Vertex("資電132",     "無障礙廁所");
    final Vertex IE129      =   new Vertex("資電128",     "女廁所");
    final Vertex IE130      =   new Vertex("資電129",     "男廁所");



    public ArrayList<Edge> getRoadEdgeList() {
        return new ArrayList<>(roadEdgeList);
    }

    public ArrayList<Vertex> getVertexList() {
        return new ArrayList<>(vertexList);
    }

    public int getEdgeSize() {
        return roadEdgeList.size();
    }

    public int getVertexSize() {
        return vertexList.size();
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

        //CORNER_2A to CORNER_2B
        roadEdgeList.add(insertEdge(CORNER_2A, NODE0201, cmToM(825), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE0201, NODE0202, cmToM(700), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE0202, NODE0203, cmToM(700), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE0203, CORNER_2B, cmToM(875), cmToM(175)));
        //CORNER_2A to CORNER_2B

        //CORNER_2B to CORNER_2C
        roadEdgeList.add(insertEdge(CORNER_2B, CORNER_2C, cmToM(105000), cmToM(175)));

        //CORNER_2C to CORNER_2D
        roadEdgeList.add(insertEdge(CORNER_2C, NODE0206, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0206, NODE0205, cmToM(1050), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0205, NODE0204, cmToM(1400), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0204, CORNER_2D, cmToM(125), cmToM(125)));
        //CORNER_2C to CORNER_2D

        //CORNER_2D to CORNER_2A
        roadEdgeList.add(insertEdge(CORNER_2D, NODE0216, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0216, CORNER_2A, cmToM(525), cmToM(125)));
        //CORNER_2D to CORNER_2A

        roadEdgeList.add(insertEdge(CORNER_2D, NODE0207, cmToM(575), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0208, CORNER_2A, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0209, NODE0208, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0210, NODE0209, cmToM(312), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0211, NODE0210, cmToM(412.5), cmToM(76)));

        roadEdgeList.add(insertEdge(CORNER_2C, NODE0214, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0214, NODE0215, cmToM(350), cmToM(125)));

        roadEdgeList.add(insertEdge(NODE0213, CORNER_2B, cmToM(175), cmToM(175)));
        roadEdgeList.add(insertEdge(NODE0212, NODE0213, cmToM(525), cmToM(175)));

        roadEdgeList.add(insertEdge(NODE0215, NODE0217, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0217, NODE0218, cmToM(660), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0218, NODE0219, cmToM(700), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0219, NODE0220, cmToM(525), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0220, CORNER_2E, cmToM(600), cmToM(125)));
        roadEdgeList.add(insertEdge(CORNER_2E, NODE0224, cmToM(625), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0224, NODE0225, cmToM(350), cmToM(125)));
        roadEdgeList.add(insertEdge(NODE0225, CORNER_2F, cmToM(475), cmToM(125)));
        roadEdgeList.add(insertEdge(CORNER_2F, NODE0226, cmToM(575), cmToM(125)));

        roadEdgeList.add(insertEdge(CORNER_2E, NODE0223, cmToM(541), cmToM(62.5)));
        roadEdgeList.add(insertEdge(NODE0223, NODE0222, cmToM(1384), cmToM(62.5)));
        roadEdgeList.add(insertEdge(NODE0222, NODE0221, cmToM(2198), cmToM(62.5)));

        roadEdgeList.add(insertEdge(CORNER_2F, NODE0227, cmToM(333), cmToM(125)));

        roadEdgeList.add(insertEdge(NODE0228, NODE0229, cmToM(167), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0229, NODE0230, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0230, NODE0231, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0231, NODE0232, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0232, NODE0233, cmToM(350), cmToM(75)));

        roadEdgeList.add(insertEdge(NODE0234, NODE0235, cmToM(167), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0235, NODE0236, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0236, NODE0237, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0237, NODE0238, cmToM(350), cmToM(75)));
        roadEdgeList.add(insertEdge(NODE0238, NODE0239, cmToM(350), cmToM(75)));

        insertEdge(IE206, NODE0227, cmToM(125), Double.MIN_VALUE);
        insertEdge(NODE0227, CORNER_2G, cmToM(375), Double.MIN_VALUE);
        insertEdge(CORNER_2G, NODE0228, cmToM(382.5), Double.MIN_VALUE);
        insertEdge(CORNER_2G, NODE0234, cmToM(382.5), Double.MIN_VALUE);
        insertEdge(IE240, NODE0211, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE241, NODE0211, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE239, NODE0210, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE238, NODE0210, cmToM(38), Double.MIN_VALUE);
        insertEdge(IE238, IE238_1, cmToM(412), Double.MIN_VALUE);

        insertEdge(IE241_1, NODE0209, cmToM(125), Double.MIN_VALUE);
        insertEdge(STAIR0202, NODE0208, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE242, CORNER_2A, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE242_1, NODE0216, cmToM(125), Double.MIN_VALUE);

        insertEdge(IE252, NODE0207, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE253, NODE0207, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE243, CORNER_2D, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE244, NODE0204, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE245, NODE0205, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE246, NODE0205, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE247, NODE0206, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE248, NODE0214, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE249, NODE0214, cmToM(125), Double.MIN_VALUE);
        insertEdge(STAIR0201, NODE0215, cmToM(125), Double.MIN_VALUE);

        insertEdge(IE237, CORNER_2C, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE224, CORNER_2C, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE225, CORNER_2B, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE226, NODE0213, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE227, NODE0212, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE228, NODE0212, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE229, NODE0212, cmToM(175), Double.MIN_VALUE);

        insertEdge(IE230, NODE0203, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE231, NODE0202, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE232, NODE0202, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE233, NODE0201, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE234, NODE0202, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE235, NODE0202, cmToM(100), Double.MIN_VALUE);
        insertEdge(IE236, NODE0203, cmToM(100), Double.MIN_VALUE);

        insertEdge(IE201, NODE0217, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE201, NODE0217, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE201, IE201_1, cmToM(1010), Double.MIN_VALUE);
        insertEdge(IE254, NODE0217, cmToM(200), Double.MIN_VALUE);
        insertEdge(ELEVATOR_A, NODE0217, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE222A, NODE0218, cmToM(200), Double.MIN_VALUE);
        insertEdge(ELEVATOR_B, NODE0218, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE223, NODE0218, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE222, NODE0219, cmToM(200), Double.MIN_VALUE);
        insertEdge(IE222, NODE0221, cmToM(1500), Double.MIN_VALUE);
        insertEdge(IE222, NODE0222, cmToM(1500), Double.MIN_VALUE);
        insertEdge(IE221, NODE0220, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE202, NODE0220, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE202, IE202_1, cmToM(175), Double.MIN_VALUE);
        insertEdge(IE203, CORNER_2E, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE220, NODE0224, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE204, NODE0225, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE205, CORNER_2F, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE250, NODE0226, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE251, NODE0226, cmToM(125), Double.MIN_VALUE);
        insertEdge(IE255, NODE0223, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE256, NODE0223, cmToM(75), Double.MIN_VALUE);

        insertEdge(IE207, CORNER_2G, cmToM(167), Double.MIN_VALUE);
        insertEdge(IE207, IE207_1, cmToM(1400), Double.MIN_VALUE);

        insertEdge(IE208, NODE0228, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE209, NODE0229, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE210, NODE0230, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE211, NODE0231, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE212, NODE0232, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE213, NODE0233, cmToM(75), Double.MIN_VALUE);

        insertEdge(IE207A, NODE0234, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE214, NODE0235, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE215, NODE0236, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE216, NODE0237, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE217, NODE0238, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE218, NODE0239, cmToM(75), Double.MIN_VALUE);
        insertEdge(IE219, NODE0239, cmToM(75), Double.MIN_VALUE);

        insertEdge(STAIR0203, NODE0227, cmToM(382.5), Double.MIN_VALUE);



    }

    ArrayList<Vertex> vertexList;
    private void addVertex() {
        vertexList = new ArrayList<>();
        vertexList.add(0, insertVertex(IE201));
        vertexList.add(1, insertVertex(IE201_1));
        vertexList.add(2, insertVertex(IE202));
        vertexList.add(3, insertVertex(IE202_1));
        vertexList.add(4, insertVertex(IE203));
        vertexList.add(5, insertVertex(IE204));
        vertexList.add(6, insertVertex(IE205));
        vertexList.add(7, insertVertex(IE206));
        vertexList.add(8, insertVertex(IE207));
        vertexList.add(9, insertVertex(IE207_1));
        vertexList.add(10, insertVertex(IE207A));
        vertexList.add(11, insertVertex(IE208));
        vertexList.add(12, insertVertex(IE209));
        vertexList.add(13, insertVertex(IE210));
        vertexList.add(14, insertVertex(IE211));
        vertexList.add(15, insertVertex(IE212));
        vertexList.add(16, insertVertex(IE213));
        vertexList.add(17, insertVertex(IE214));
        vertexList.add(18, insertVertex(IE215));
        vertexList.add(19, insertVertex(IE216));
        vertexList.add(20, insertVertex(IE217));
        vertexList.add(21, insertVertex(IE218));
        vertexList.add(22, insertVertex(IE219));
        vertexList.add(23, insertVertex(IE220));
        vertexList.add(24, insertVertex(IE221));
        vertexList.add(25, insertVertex(IE222));
        vertexList.add(26, insertVertex(IE222A));
        vertexList.add(27, insertVertex(IE223));
        vertexList.add(28, insertVertex(IE224));
        vertexList.add(29, insertVertex(IE225));
        vertexList.add(30, insertVertex(IE226));
        vertexList.add(31, insertVertex(IE227));
        vertexList.add(32, insertVertex(IE228));
        vertexList.add(33, insertVertex(IE229));
        vertexList.add(34, insertVertex(IE230));
        vertexList.add(35, insertVertex(IE231));
        vertexList.add(36, insertVertex(IE232));
        vertexList.add(37, insertVertex(IE233));
        vertexList.add(38, insertVertex(IE234));
        vertexList.add(39, insertVertex(IE235));
        vertexList.add(40, insertVertex(IE236));
        vertexList.add(41, insertVertex(IE237));
        vertexList.add(42, insertVertex(IE238));
        vertexList.add(43, insertVertex(IE238_1));
        vertexList.add(44, insertVertex(IE239));
        vertexList.add(45, insertVertex(IE240));
        vertexList.add(46, insertVertex(IE241));
        vertexList.add(47, insertVertex(IE241_1));
        vertexList.add(48, insertVertex(IE242));
        vertexList.add(49, insertVertex(IE242_1));
        vertexList.add(50, insertVertex(IE243));
        vertexList.add(51, insertVertex(IE244));
        vertexList.add(52, insertVertex(IE245));
        vertexList.add(53, insertVertex(IE246));
        vertexList.add(54, insertVertex(IE247));
        vertexList.add(55, insertVertex(IE248));
        vertexList.add(56, insertVertex(IE249));
        vertexList.add(57, insertVertex(IE250));
        vertexList.add(58, insertVertex(IE251));
        vertexList.add(59, insertVertex(IE252));
        vertexList.add(60, insertVertex(IE253));
        vertexList.add(61, insertVertex(IE254));
        vertexList.add(62, insertVertex(IE255));
        vertexList.add(63, insertVertex(IE256));
        vertexList.add(64, insertVertex(CORNER_2A));
        vertexList.add(65, insertVertex(CORNER_2B));
        vertexList.add(66, insertVertex(CORNER_2C));
        vertexList.add(67, insertVertex(CORNER_2D));
        vertexList.add(68, insertVertex(CORNER_2E));
        vertexList.add(69, insertVertex(CORNER_2F));
        vertexList.add(70, insertVertex(CORNER_2G));
        vertexList.add(71, insertVertex(STAIR0201));
        vertexList.add(72, insertVertex(STAIR0202));
        vertexList.add(73, insertVertex(STAIR0203));
        vertexList.add(74, insertVertex(ELEVATOR_A));
        vertexList.add(75, insertVertex(ELEVATOR_B));
        insertVertex(NODE0201);
        insertVertex(NODE0202);
        insertVertex(NODE0203);
        insertVertex(NODE0204);
        insertVertex(NODE0205);
        insertVertex(NODE0206);
        insertVertex(NODE0207);
        insertVertex(NODE0208);
        insertVertex(NODE0209);
        insertVertex(NODE0210);
        insertVertex(NODE0211);
        insertVertex(NODE0212);
        insertVertex(NODE0213);
        insertVertex(NODE0214);
        insertVertex(NODE0215);
        insertVertex(NODE0216);
        insertVertex(NODE0217);
        insertVertex(NODE0218);
        insertVertex(NODE0219);
        insertVertex(NODE0220);
        insertVertex(NODE0221);
        insertVertex(NODE0222);
        insertVertex(NODE0223);
        insertVertex(NODE0224);
        insertVertex(NODE0225);
        insertVertex(NODE0226);
        insertVertex(NODE0227);
        insertVertex(NODE0228);
        insertVertex(NODE0229);
        insertVertex(NODE0230);
        insertVertex(NODE0231);
        insertVertex(NODE0232);
        insertVertex(NODE0233);
        insertVertex(NODE0234);
        insertVertex(NODE0235);
        insertVertex(NODE0236);
        insertVertex(NODE0237);
        insertVertex(NODE0238);
        insertVertex(NODE0239);
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