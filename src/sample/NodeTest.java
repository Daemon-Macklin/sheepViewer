package sample;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for Node Class
 *
 * @author Daemon-Macklin
 *
 */

public class NodeTest {

    private Node node1;
    private Node nodeInvalid;
    private Node parent;

    /**
     * Set up test fixtures
     *
     * Called before every test method
     */
    @Before
    public void setUp() {
        node1 = new Node(1,1);
        nodeInvalid = new Node(2,2);
        parent = new Node (1,3);
    }

    /**
     * Teardown test fixtures
     *
     * Called after each test method
     */
    @After
    public void tearDown() {

    }

    /**
     * Test the contsructor
     */
    @Test
    public void testConstructor() {
        assertNotNull(node1); //will test these in testGetters()
        assertEquals(0, nodeInvalid.getValue());
    }

    /**
     * Test all getters using valid data
     */
    @Test
    public void testGetters() {
        assertEquals(1, node1.getValue());
        assertEquals(null, node1.getParent());
        assertEquals(false, node1.isRoot());
    }

    /**
     * Test all setters for Node
     */
    @Test
    public void testSetters() {
        node1.setParent(parent); //Valid change
        assertEquals(parent, node1.getParent());
    }
}



