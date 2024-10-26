FROM node

WORKDIR /app

COPY . /app

RUN npm install -g nodemon

VOLUME [ "/node_modules" ]

CMD [ "nodemon", "-L", "improved_bubble_sort.js" ]