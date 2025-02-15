let addDays = (date, days) => {
    if (!date || !days) {
        return;
    }
    let calculatedDate = new Date(date.valueOf());
    calculatedDate.setUTCDate(date.getUTCDate() + days);
    return calculatedDate;
}

let addMinutes = (date, minutes) => {
    if (!date || !minutes) {
        return;
    }
    let calculatedDate = new Date(date.valueOf());
    calculatedDate.setMinutes(date.getUTCMinutes() + minutes);
    return calculatedDate;
}

let msToTime = (duration) => {
    if (duration === null 
        || duration === undefined || duration < 0) {
        return;
    }

    let seconds = Math.floor((duration/1000)%60), 
        minutes = Math.floor((duration/(1000*60))%60), 
        hours = Math.floor(duration/(1000*60*60));

    hours = (hours < 10) ? "0" + hours : hours;
    minutes = (minutes < 10) ? "0" + minutes : minutes;
    seconds = (seconds < 10) ? "0" + seconds : seconds;
    return hours + ":" + minutes + ":" + seconds;
}

let isTimeBetweenAzans = (time, salahPeriod) => {
    if (!time || !salahPeriod || salahPeriod.length != 2
        || !salahPeriod[0].azan || !salahPeriod[1].azan) {
        return false;
    }

    return time > salahPeriod[0].azan.getTime() 
        && time < salahPeriod[1].azan.getTime()
}

let toISODateString = (date) => {
    if (!date) {
        return;
    }
    let isoString = date.toISOString();
    return isoString.substring(0, 10);
};

module.exports = {addDays, addMinutes, msToTime, isTimeBetweenAzans, toISODateString};