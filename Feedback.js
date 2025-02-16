document.getElementById('feedbackForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const phoneNumber = document.getElementById('phoneNumber').value;
    const email = document.getElementById('email').value;
    const feedback = document.getElementById('feedback').value;

    const data = {
        name: name,
        phoneNumber: phoneNumber,
        email: email,
        feedback: feedback
    };

    fetch('http://localhost:8081/api/feedback/submit', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('responseMessage').innerText = 'Feedback submitted successfully!';
        document.getElementById('feedbackForm').reset();
        alert('Thank you for your feedback!');
    })
    .catch(error => {
        document.getElementById('responseMessage').innerText = 'Error submitting feedback. Please try again.';
        console.error('Error:', error);
    });
});
