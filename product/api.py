# Product Service

# Import framework
from flask import Flask
from flask_restful import Resource, Api
from flask import request
import json
# Instantiate the app
app = Flask(__name__)
deck = [];
api = Api(app)


@app.route('/addcard', methods = ['POST'])
def addCard():
	if request.method == 'POST':
		parameters = request.form['card']
		deck.append(parameters)
		print (deck)
		return json.dumps(deck)
	else:
		return '404'


@app.route('/playcard', methods = ['POST'])
def playCard():
	if request.method == 'POST':
		parameters = request.form['card']
		deck.append(parameters)
		print (deck)
		return json.dumps(deck)
	else:
		return '404'


@app.route('/removecard', methods = ['POST'])
def removeCard():
	if request.method == 'POST':
		parameters = request.form['card']
		deck.append(parameters)
		print (deck)
		return json.dumps(deck)
	else:
		return '404'

@app.route('/emptydeck', methods = ['GET'])
def emptyDeck():
	if request.method == 'GET':
		deck=[]
		print (deck)
		return json.dumps(deck)
	else:
		return '404'

@app.route('/shuffle', methods = ['GET'])
def shuffle():
	if request.method == 'GET':
		deck=[]
		print (deck)
		return json.dumps(deck)
	else:
		return '404'

# Run the application
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=80, debug=True)
