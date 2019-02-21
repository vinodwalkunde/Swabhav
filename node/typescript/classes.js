var point = /** @class */ (function () {
    function point(X, Y) {
        this._X = X;
        this._Y = Y;
    }
    Object.defineProperty(point.prototype, "X", {
        get: function () {
            return this._X;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(point.prototype, "Y", {
        get: function () {
            return this._Y;
        },
        enumerable: true,
        configurable: true
    });
    return point;
}());
var P1 = new point(10, 20);
console.log(P1.X);
console.log(P1.Y);
