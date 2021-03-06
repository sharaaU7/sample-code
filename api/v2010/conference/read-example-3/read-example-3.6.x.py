# Download the helper library from https://www.twilio.com/docs/python/install
from datetime import date
from twilio.rest import Client


# Your Account Sid and Auth Token from twilio.com/console
# DANGER! This is insecure. See http://twil.io/secure
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
client = Client(account_sid, auth_token)

conferences = client.conferences.list(
                                     date_created=date(2009, 7, 6),
                                     status='completed',
                                     limit=20
                                 )

for record in conferences:
    print(record.sid)
