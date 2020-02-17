sh = {_args -> _args }

docker = {
    image = { String img -> 
        inside = { String _param, Closure c={any()} -> 
            //in real world the implementation for docker pipeline would be
            print "docker run --name ${Math.random()} ${_param} ${img} ${c.call()}" 
        }
    } 
}.call()

docker.image("IMAGE").inside("INSIDE") ​{ sh "Hello World" }​​​
