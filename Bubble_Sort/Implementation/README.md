# Run Application

## Using Node

1. Ensure that Node is installed locally
2. Download the bubble_sort.js file
3. In this file's dir run `node bubble_sort.js`

## Using Docker

1. Ensure Docker is installed and running locally
2. Download all files in this path
3. In a command terminal where these files are located create a docker image using the command
   `docker build -t bubble-sort:latest`
4. Create and run a docker container based on this image using
   `docker run --rm bubble-sort:latest`
