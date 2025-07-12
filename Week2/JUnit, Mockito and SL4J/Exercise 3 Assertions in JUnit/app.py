from flask import Flask
app = Flask(__name__)   # Flask constructor

# A decorator used to tell the application
# which URL is associated function
# @app.route('/')
# def hello():

#     return 'WORLD  ' + world()
# def world():
#     return 'HELLO'


# decorator to route URL
# decorator
# to route URL
# @app.route('/hello')

# # binding to the function of route
# def hello_world():
#     return 'hello world'

@app.route('/hello/<name>')
def hello_name(name):
    return 'Hello %s!' % name

@app.route('/world/<hello>')
def hello(hello):
    return 'Hello %s!' % hello


# app.add_url_rule('/', 'hello', hello_world)
if __name__=='__main__':
   app.run(debug=True)