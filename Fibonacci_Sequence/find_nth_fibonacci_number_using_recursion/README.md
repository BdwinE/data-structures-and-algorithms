# Run Application

## Using Node

1. Ensure that Node is installed locally
2. Download the find_nth_fibonacci_num.js and package.json file
3. In these files dir run the command `npm install`(Node has to be installed)
4. run `node find_nth_fibonacci_num.js`

## Using Docker

1. Ensure Docker is installed and running locally
2. Download all files in this path
3. In a command terminal where these files are located create a docker image using the command
   `docker build -t find-nth:latest`
4. Create and run a docker container based on this image using
   `docker run --name find-nth-fib-app --rm -v "%cd%":/app find-nth:latest` (replace `%cd%` with `$(pwd)` if you are a mac user)
