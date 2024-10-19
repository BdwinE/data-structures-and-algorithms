FROM node

WORKDIR /app

COPY package.json /app

RUN npm install

COPY . /app

#used to insure that the node_modules file is not 
#overwritten when container is ran with a bind mount
VOLUME [ "/app/node_modules" ]

CMD ["npm", "start"]