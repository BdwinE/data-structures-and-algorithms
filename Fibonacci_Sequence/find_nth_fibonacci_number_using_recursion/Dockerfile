FROM node

WORKDIR /app

COPY . /app

RUN npm install -g nodemon

#used to insure that the node_modules file is not 
#overwritten when container is ran with a bind mount
VOLUME [ "/app/node_modules" ]

CMD [ "nodemon", "-L", "find_nth_fibonacci_number.js" ]