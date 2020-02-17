//simple closure
sh = { _args -> println(_args) }

// complex closure i.e. closure inside closure
docker = {
    image = { String img -> 
        inside = { String _param, Closure c -> 
            print("image param : ${img}, inside param : ${_param}")
            c.call() 
        }
    } 
}.call()

//calling the above closure and passing closure as parameter
docker.image("IMAGE").inside("INSIDE") {
    sh("echo HelloWorld")
}

//without call() function in line number #12
docker().image("IMAGE").inside("INSIDE") {
    sh("echo HelloWorld")
}
