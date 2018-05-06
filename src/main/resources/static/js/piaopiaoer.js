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
        alert.error(data.msg);
        return Promise.reject(data.msg);
    });
};

const invoice = (function ($) {

    let save = function (clickButton) {
        let invoiceForm = $(clickButton).parents(".invoice-form");
        let data = invoiceForm.serializeArray().reduce(function(m,o){ m[o.name] = o.value; return m;}, {});
        apiRequest("/invoice", data, "POST")
            .then(function () {
                alert.success("保存成功");
            });
    };

    return {
        save: save
    }

})(jQuery);

const alert = (function ($) {

    let showMessage = function (data) {

            let alert = $(template('alertTpl', data));

            alert.insertAfter('.navbar');

            setTimeout(function () {
                alert.alert('close');
            }, 2000)

        },
        error = function (message) {
            showMessage({message: message, type: 'danger'});
        },

        warning = function (message) {
            showMessage({message: message, type: 'warning'});
        },

        success = function (message) {
            showMessage({message: message, type: 'success'});
        },

        info = function (message) {
            showMessage({message: message, type: 'info'});
        };

    return {
        success: success,
        error: error,
        warning: warning,
        info: info
    }
    
})(jQuery);