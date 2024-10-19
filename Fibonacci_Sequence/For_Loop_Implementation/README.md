# Run Application

## Using Node

1. Ensure that Node is installed locally
2. Download the for_loop_fib_seq.js file
3. In this file's dir run `node for_loop_fib_seq.js`

## Using Docker

1. Ensure Docker is installed and running locally
2. Download all files in this path
3. In a command terminal where these files are located create a docker image using the command
   `docker build -t for-loop-fib:latest`
4. Create and run a docker container based on this image using
   `docker run --name for-loop-fib-app --rm for-loop-fib:latest`
