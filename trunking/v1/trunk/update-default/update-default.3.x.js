// Download the helper library from https://www.twilio.com/docs/node/install
// Your Account Sid and Auth Token from twilio.com/console
// DANGER! This is insecure. See http://twil.io/secure
const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const client = require('twilio')(accountSid, authToken);

client.trunking.trunks('TRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
               .update({friendlyName: 'friendly_name'})
               .then(trunk => console.log(trunk.domainName));
