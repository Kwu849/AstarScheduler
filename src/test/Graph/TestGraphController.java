package test.Graph;

import graph.GraphController;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.DefaultGraph;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGraphController {
    private Graph Nodes_7_OutTree = new DefaultGraph("Nodes_7_OutTree.dot");

    @Before
    public void Initialise(){
        //Load all the graphs into the graphstream objects.
        Nodes_7_OutTree = GraphController.defaultGraph(Nodes_7_OutTree,"Nodes_7_OutTree.dot");
    }

    @Test
    public void testNodeWeight(){
        assertEquals(GraphController.getNodeWeight("0",Nodes_7_OutTree),5,0);
        assertEquals(GraphController.getNodeWeight("1",Nodes_7_OutTree),6,0);
        assertEquals(GraphController.getNodeWeight("2",Nodes_7_OutTree),5,0);
        assertEquals(GraphController.getNodeWeight("3",Nodes_7_OutTree),6,0);
        assertEquals(GraphController.getNodeWeight("4",Nodes_7_OutTree),4,0);
        assertEquals(GraphController.getNodeWeight("5",Nodes_7_OutTree),7,0);
        assertEquals(GraphController.getNodeWeight("6",Nodes_7_OutTree),7,0);
    }

    @Test
    public void testEdgeWeight(){
        assertEquals(GraphController.getEdgeWeight("0","1",Nodes_7_OutTree),15,0);
        assertEquals(GraphController.getEdgeWeight("0","2",Nodes_7_OutTree),11,0);
        assertEquals(GraphController.getEdgeWeight("0","3",Nodes_7_OutTree),11,0);
        assertEquals(GraphController.getEdgeWeight("1","4",Nodes_7_OutTree),19,0);
        assertEquals(GraphController.getEdgeWeight("1","5",Nodes_7_OutTree),4,0);
        assertEquals(GraphController.getEdgeWeight("1","6",Nodes_7_OutTree),21,0);
    }

    @Test
    public void testChangeAttribute(){
        assertEquals(GraphController.getNodeWeight("0",Nodes_7_OutTree),5,0);
        GraphController.changeAttribute("0","Weight",100,Nodes_7_OutTree);
        assertTrue("The weight was changed correctly",GraphController.getNodeWeight("0",Nodes_7_OutTree)==100);
    }

}
