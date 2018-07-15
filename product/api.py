# Product Service

# Import framework
from flask import Flask
from flask_restful import Resource, Api
from flask import request
# Instantiate the app
app = Flask(__name__)
api = Api(app)

@app.route('/', methods = ['GET', 'POST'])
def main():
    if request.method == 'GET':
        return 'hello'
    if request.method == 'POST':
        return request.form
    else:
        return '404'

# Run the application
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=80, debug=True)
