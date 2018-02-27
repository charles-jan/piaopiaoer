const apiRequest = function (url, data, method) {
    let isOk = false;
    return fetch(url, {
        method: method || 'GET',
        mode: 'cors',
        headers: {
            'credentials': 'include',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    }).then(function (response) {
        isOk = response.ok;
        return response.json();
    }).then(function (data) {
        if (isOk) {
            return data;
        }
        console.log(data.message);
        return Promise.reject(data.message);
    });
};

const invoice = (function ($) {

    let save = function (clickButton) {
        let invoiceForm = $(clickButton).parents(".invoice-form");
        let data = invoiceForm.serializeArray().reduce(function(m,o){ m[o.name] = o.value; return m;}, {});
        console.log(data);
        apiRequest("/invoice", data, "POST")
            .then(function (result) {
                console.log(result);
            });
    };

    return {
        save: save
    }

})(jQuery);
