package net.samitkumar.demo

class HelloWorldGroovyTest extends GroovyTestCase {

    void testSample01(){
        assert 1==1
        assertTrue(1==1)
    }

    void testSample02() {
        assertScript '''
            def x = 1
            def y = 2
    
            assert x + y == 3
        '''
    }

}
