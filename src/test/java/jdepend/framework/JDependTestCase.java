package jdepend.framework;

import java.io.*;

import junit.framework.*;

/**
 * @author <b>Mike Clark</b>
 * @author Clarkware Consulting, Inc.
 */

public class JDependTestCase extends TestCase {

    private String homeDir;
    private String testDir;
    private String testSrcDir;
    private String testDataDir;
    private String buildDir;
    private String testBuildDir;
    private String packageSubDir;
    private String originalUserHome;

    
    public JDependTestCase(String name) {
        super(name);
    }
    
    public void test() {
    	assertEquals("true","true");
    }
    
    protected void setUp() {

        homeDir = System.getProperty("jdepend.home");
        if (homeDir == null) {
            fail("Property 'jdepend.home' not defined");
        }
        if(!homeDir.endsWith(File.separator))
        	homeDir += File.separator;
        testDir = homeDir + "src" + File.separator + "test" + File.separator;
        testSrcDir = testDir + "java" + File.separator;
        testDataDir = testDir + "resources" + File.separator + "data" + File.separator;
        buildDir = homeDir + "target" + File.separator + "classes" + File.separator;
        testBuildDir = homeDir + "target" + File.separator + "test-classes" + File.separator;
        packageSubDir = "jdepend" + File.separator + 
                        "framework" + File.separator;
        originalUserHome = System.getProperty("user.home");
    }

    protected void tearDown() {
        System.setProperty("user.home", originalUserHome);
    }

    public String getHomeDir() {
        return homeDir;
    }

    public String getTestSrcDir() {
		return testSrcDir;
	}

	public String getTestDataDir() {
        return testDataDir;
    }
    
    public String getTestDir() {
        return testDir;
    }

    public String getBuildDir() {
        return buildDir;
    }
    
    public String getTestBuildDir() {
		return testBuildDir;
	}

	public String getPackageSubDir() {
        return packageSubDir;
    }
}